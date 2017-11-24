package by.homework.dao.impl.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import by.homework.dao.PersonDAO;
import by.homework.entity.Economist;
import by.homework.util.MyBatisUtil;

public class EconomistDAOImpl implements PersonDAO<Economist> {
	private static String namespace = "EconomistMapper";

	@Override
	public Economist getById(long id) {

		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		Economist economist = session.selectOne("EconomistMapper.getById", id);
		session.close();
		return economist;

	}

	@Override
	public List<Economist> getAll() {

		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		List<Economist> economists = session.selectList("EconomistMapper.getAll");
		session.close();
		return economists;
	}

	@Override
	public void delete(long id) {

		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.delete(namespace + ".deleteEconomist", id);
		session.delete(namespace + ".deletePerson", id);
		session.commit();
		session.close();
	}

	@Override
	public void create(Economist economist) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.insert(namespace + ".ñreateEconomist", economist);
		session.insert(namespace + ".createPerson", economist);
		session.commit();
		session.close();
	}

	@Override
	public void update(Economist economist) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.update(namespace + ".updateEconomist", economist);
		session.update(namespace + ".updatePerson", economist);
		session.commit();
		session.close();
	}
}