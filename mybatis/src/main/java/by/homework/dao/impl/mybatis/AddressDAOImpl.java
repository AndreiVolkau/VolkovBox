package by.homework.dao.impl.mybatis;

import org.apache.ibatis.session.SqlSession;

import by.homework.dao.AddressDAO;
import by.homework.entity.Address;
import by.homework.util.MyBatisUtil;

public class AddressDAOImpl implements AddressDAO {
	private static String namespace = "AddressMapper";

	@Override
	public void create(Address address) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.insert(namespace + ".create", address);
		session.commit();
		session.close();
	}

	@Override
	public Address getById(long id) {
		/*
		 * MyBatisUtil util = MyBatisUtil.getInstance(); SqlSessionFactory factory =
		 * util.getSqlSessionFactory(); SqlSession session2 = factory.openSession();
		 */

		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		Address address = session.selectOne("AddressMapper.getById", id);
		session.close();
		return address;

	}

	@Override
	public void update(Address address) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.update(namespace + ".update", address);
		session.commit();
		session.close();
	}

	@Override
	public void delete(long id) {

		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.delete(namespace + ".delete", id);
		session.commit();
		session.close();
	}

}
