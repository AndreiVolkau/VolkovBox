package by.homework.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import by.homework.entity.Economist;
import by.homework.util.MyBatisUtil;

public class EconomistDAOImpl implements PersonDAO {

	@Override
	public Economist getById(long id) {

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Economist economist = session.selectOne("EconomistMapper.getById", id);
		session.close();
		return economist;

	}

	@Override
	public List<Economist> getAll() {

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Economist> economists = session.selectList("EconomistMapper.getAll");
		session.close();
		return economists;
	}
}
