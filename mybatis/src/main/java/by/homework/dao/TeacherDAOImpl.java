package by.homework.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import by.homework.entity.Teacher;
import by.homework.util.MyBatisUtil;

public class TeacherDAOImpl implements TeacherDAO {

	public Teacher getById(long id) {

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		Teacher teacher = session.selectOne("TeacherMapper.getById", id);
		session.close();
		return teacher;
	}

	public List<Teacher> getAll() {

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		List<Teacher> teachers = session.selectList("TeacherMapper.getAll");
		session.close();
		return teachers;
	}
}
