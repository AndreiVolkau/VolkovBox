package by.homework.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

public class MyBatisUtil {
	public static final Logger LOGGER = Logger.getLogger(MyBatisUtil.class);
	private static final MyBatisUtil INSTANCE = new MyBatisUtil();
	private SqlSessionFactory sqlSessionFactory;
	private String resource = "mybatis-config.xml";

	public static MyBatisUtil getInstance() {
		return INSTANCE;
	}

	private MyBatisUtil() {
		init();
	}

	private void init() {

		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			LOGGER.error(e);
		}
	}

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

}
