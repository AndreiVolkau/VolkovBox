package by.homework.dao.impl.jdbc;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import by.homework.dao.PersonDAO;
import by.homework.entity.Person;
import by.homework.entity.Student;
import by.homework.util.MyBatisUtil;

public class StudentDAOImpl implements PersonDAO<Student> {
	private static String namespace = "StudentMapper";

	@Override
	public Student getById(long id) {

		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		Student student = session.selectOne("StudentMapper.getById", id);
		session.close();
		return student;
	}

	@Override
	public List<Student> getAll() {

		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		List<Student> students = session.selectList("StudentMapper.getAll");
		session.close();
		return students;
	}

	@Override
	public void delete(long id) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.delete(namespace + ".deleteStudent", id);
		session.delete(namespace + ".deletePerson", id);
		session.commit();
		session.close();
	}

	@Override
	public void create(Student student) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.insert(namespace + ".ñreateStudent", student);
		session.insert(namespace + ".createPerson", student);
		session.commit();
		session.close();

	}

	@Override
	public void update(Student student) {
		SqlSession session = MyBatisUtil.getInstance().getSqlSessionFactory().openSession();
		session.update(namespace + ".updateEconomist", student);
		session.update(namespace + ".updatePerson", student);
		session.commit();
		session.close();
	}
}
