package by.homework.dao;

import org.apache.ibatis.session.SqlSession;

import by.homework.entity.Address;
import by.homework.util.MyBatisUtil;

public class AddressDAOImpl implements AddressDAO {
	@Override
	public Address getById(long id) {

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Address address = session.selectOne("AddressMapper.getById", id);
		session.close();
		return address;

	}

}
