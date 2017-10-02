package by.homework;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException {

		ConnectionPool pool = ConnectionPool.getConnectionPool();

		Connection conn = pool.getConnection();
		PreparedStatement pst = conn.prepareStatement(
				"select e.age, GROUP_CONCAT(DISTINCT CONCAT(e.name,' ',e.surname,' : ', ifnull (a.address,'no address')) SEPARATOR ';') nameAndAddress from employees.employee e "
						+ "left join employees.employee_address a " + "on e.EmployeeID = a.EmployeeID "
						+ "group by e.age " + "having e.age > 22");

		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int age = rs.getInt(1);
			String name = rs.getString(2);

			System.out.println(age + " " + name);
		}

		pool.releaseConnection(conn);

	}

}
