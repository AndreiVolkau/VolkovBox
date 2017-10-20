package by.homework;

import java.util.List;

import by.homework.converter.ConverterUtil;
import by.homework.dao.StudentDAO;
import by.homework.dao.StudentDAOImpl;
import by.homework.dao.TeacherDAO;
import by.homework.dao.TeacherDAOImpl;
import by.homework.entity.Student;
import by.homework.entity.Teacher;

public class Main {

	public static void main(String[] args) {
		TeacherDAO teacherDAO = new TeacherDAOImpl();
		Teacher teacher = teacherDAO.getById(1);
		System.out.println(teacher);
		List<Teacher> teachers = teacherDAO.getAll();
		System.out.println(teachers);

		StudentDAO studentDAO = new StudentDAOImpl();
		Student student = studentDAO.getById(1);
		System.out.println(student);
		List<Student> students = studentDAO.getAll();
		System.out.println(students);
		ConverterUtil.toJSON(students, "src\\students.json");

	}

}
