package by.homework;

import java.util.Arrays;
import java.util.List;

import by.homework.converter.ConverterUtil;
import by.homework.dao.EconomistDAO;
import by.homework.dao.EconomistDAOImpl;
import by.homework.dao.StudentDAO;
import by.homework.dao.StudentDAOImpl;
import by.homework.dao.TeacherDAO;
import by.homework.dao.TeacherDAOImpl;
import by.homework.entity.Economist;
import by.homework.entity.Specialisation;
import by.homework.entity.Student;
import by.homework.entity.Teacher;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {

	private static final Specialisation MATH_TEACHER = null;

	public static void main(String[] args) {
		TeacherDAO teacherDAO = new TeacherDAOImpl();
		Teacher teacher = teacherDAO.getById(1);
		System.out.println(teacher);
		List<Teacher> teachers = teacherDAO.getAll();

		for (Teacher teacher2 : teachers) {
			System.out.println(teacher2);
		}
		StudentDAO studentDAO = new StudentDAOImpl();
		Student student = studentDAO.getById(1);
		System.out.println(student);
		List<Student> students = studentDAO.getAll();
		System.out.println(students);

		EconomistDAO economistDAO = new EconomistDAOImpl();
		Economist economist = economistDAO.getById(1);
		System.out.println(economist);
		List<Economist> economists = economistDAO.getAll();
		System.out.println(economists);

		ConverterUtil.toJSON(students, "src\\students.json");

		Teacher t = new Teacher();
		Class<? extends Teacher> aclass = t.getClass();
		t.getName();
		System.out.println("Teacher's " + aclass);

		Class<? extends Teacher> Teacher = t.getClass();
		Class<?> superclass = Teacher.getSuperclass();

		System.out.println("Teacher's superclass is " + superclass);

		Method[] m = t.getClass().getMethods();
		System.out.println("Teacher's methods are " + Arrays.toString(m));
		Field[] f = t.getClass().getDeclaredFields();
		System.out.println("Teacher's fields are " + Arrays.toString(f));
	}
}
