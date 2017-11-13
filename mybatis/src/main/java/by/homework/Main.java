package by.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import by.homework.converter.ConverterUtil;
import by.homework.dao.AddressDAO;
import by.homework.dao.AddressDAOImpl;
import by.homework.dao.EconomistDAOImpl;
import by.homework.dao.PersonDAO;
import by.homework.dao.StudentDAOImpl;
import by.homework.dao.TeacherDAOImpl;
import by.homework.entity.Address;
import by.homework.entity.Person;
import by.homework.entity.Student;
import by.homework.entity.Teacher;

public class Main {

	public static void main(String[] args) throws Exception {
		PersonDAO teacherDAO = new TeacherDAOImpl();

		List<Person> teachers = (List<Person>) teacherDAO.getAll();

		for (Person teacher2 : teachers) {
			System.out.println(teacher2);
		}
		PersonDAO studentDAO = new StudentDAOImpl();
	
		List<Person> students = (List<Person>) studentDAO.getAll();

		PersonDAO economistDAO = new EconomistDAOImpl();
		
		List<Person> economists = (List<Person>) economistDAO.getAll();
		System.out.println(economists);
		System.out.println("Converter");
		ConverterUtil.toJSON(students, "src\\students.json");
		Person p[] = ConverterUtil.toObject(Student[].class, "src\\students.json");
		for (Person person : p) {
			System.out.println(person);
		}
		Teacher t = new Teacher();
		Class<? extends Teacher> aclass = t.getClass();
		t.getName();
		System.out.println("Reflection");
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
