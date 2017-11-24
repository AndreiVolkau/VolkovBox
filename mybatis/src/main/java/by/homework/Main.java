package by.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import by.homework.converter.ConverterUtil;
import by.homework.dao.PersonDAO;
import by.homework.dao.impl.mybatis.EconomistDAOImpl;
import by.homework.dao.impl.mybatis.StudentDAOImpl;
import by.homework.dao.impl.mybatis.TeacherDAOImpl;
import by.homework.entity.Person;
import by.homework.entity.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		PersonDAO teacherDAO = new TeacherDAOImpl();

		List<Person> teachers = (List<Person>) teacherDAO.getAll();

		for (Person teacher : teachers) {
			System.out.println(teacher);
		}
		PersonDAO studentDAO = new StudentDAOImpl();

		PersonDAO economistDAO = new EconomistDAOImpl();

		List<Person> list = (List<Person>) economistDAO.getAll();
		List<Person> economists = list;
		System.out.println(economists);

		ConverterUtil.toJSON(teachers, "src\\teachers.json");

		Teacher t = new Teacher();
		Class<? extends Teacher> aclass = t.getClass();
		t.getName();
		System.out.println("Reflection");
		System.out.println("Teacher's " + aclass);

		Class<? extends Teacher> Teacher = t.getClass();
		Class<?> superclass = Teacher.getSuperclass();

		System.out.println("Teacher's superclass is " + superclass);

		Method[] m = t.getClass().getMethods();

		System.out.println("Teacher's methods are \n" + Arrays.toString(m));

		Field[] f = t.getClass().getDeclaredFields();
		System.out.println("Teacher's fields are \n " + Arrays.toString(f));
	}
}
