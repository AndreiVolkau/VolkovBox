package by.homework;

import java.sql.DriverManager;
import java.util.Properties;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;

public class ConnectionPool {

	private static ConnectionPool INSTANCE;
	private BlockingQueue<Connection> connectionQueue;

	public static ConnectionPool getConnectionPool() {

		Lock l = new ReentrantLock();
		l.lock();
		try {
			if (INSTANCE == null) {
				INSTANCE = new ConnectionPool();
			}
			return INSTANCE;
		} finally {
			l.unlock();
		}

	}

	private ConnectionPool() {
		init();
	}

	private void init() {

		try (InputStream input = new FileInputStream("src/config.properties");) {

			Properties prop = new Properties();
			prop.load(input);
			String userName = prop.getProperty("db.username");
			String pass = prop.getProperty("db.pass");
			int poolSize = Integer.parseInt(prop.getProperty("dbpool.size"));
			connectionQueue = new ArrayBlockingQueue<Connection>(poolSize);

			Class.forName("com.mysql.cj.jdbc.Driver");

			for (int i = 0; i < poolSize; i++) {

				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/myDb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false",
						userName, pass);

				connectionQueue.add(conn);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = connectionQueue.poll(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void releaseConnection(Connection conn) {
		if (conn != null && connectionQueue.size() < 3) {
			connectionQueue.add(conn);
		}
	}

}
