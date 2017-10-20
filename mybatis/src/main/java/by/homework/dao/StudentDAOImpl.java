package by.homework.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import by.homework.entity.Student;
import by.homework.util.MyBatisUtil;

	public class StudentDAOImpl implements StudentDAO {

		public Student getById(long id) {

			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			Student student = session.selectOne("StudentMapper.getById", id);
			session.close();
			return student;
		}

		public List<Student> getAll() {

			SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
			List<Student> students = session.selectList("StudentMapper.getAll");
			session.close();
			return students;
		}
	}


