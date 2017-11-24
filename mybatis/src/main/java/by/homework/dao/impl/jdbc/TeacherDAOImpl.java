package by.homework.dao.impl.jdbc;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import by.homework.dao.PersonDAO;
import by.homework.entity.Economist;
import by.homework.entity.Person;
import by.homework.entity.Teacher;
import by.homework.util.MyBatisUtil;

public class TeacherDAOImpl implements PersonDAO<Teacher> {
	private static String namespace = "TeacherMapper";

	@Override
	public Teacher getById(long id) {

		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		Teacher teacher = session.selectOne("TeacherMapper.getById", id);
		session.close();
		return teacher;
	}

	@Override
	public List<Teacher> getAll() {

		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		List<Teacher> teachers = session.selectList("TeacherMapper.getAll");
		session.close();
		return teachers;
	}

	@Override
	public void delete(long id) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.delete(namespace + ".deleteTeacher", id);
		session.delete(namespace + ".deletePerson", id);
		session.commit();
		session.close();

	}

	@Override
	public void create(Teacher teacher) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.insert(namespace + ".ñreateTeacher", teacher);
		session.insert(namespace + ".createPerson", teacher);
		session.commit();
		session.close();

	}

	@Override
	public void update(Teacher teacher) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.update(namespace + ".updateTeacher", teacher);
		session.update(namespace + ".updatePerson", teacher);
		session.commit();
		session.close();

	}
}
