package by.homework.teacher;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import by.homework.util.MyBatisUtil;

public class TeacherDAO {

	public Teacher getById(long id) {

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TeacherMapper mapper = session.getMapper(TeacherMapper.class);
		Teacher teacher = mapper.getById(id);
		session.close();
		return teacher;
	}
	
	public List<Teacher> getAll() {

		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		TeacherMapper mapper = session.getMapper(TeacherMapper.class);
		List<Teacher> teachers = mapper.getAll();
		session.close();
		return teachers;
	}
}
