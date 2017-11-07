package by.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import by.homework.converter.ConverterUtil;
import by.homework.dao.EconomistDAOImpl;
import by.homework.dao.PersonDAO;
import by.homework.dao.StudentDAOImpl;
import by.homework.dao.TeacherDAOImpl;
import by.homework.entity.Person;
import by.homework.entity.Teacher;

public class Main {


	public static void main(String[] args) {
		PersonDAO teacherDAO = new TeacherDAOImpl();
		Person teacher = teacherDAO.getById(1);
		System.out.println(teacher);
		List<Person> teachers =  (List<Person>) teacherDAO.getAll();

		for (Person teacher2 : teachers) {
			System.out.println(teacher2);
		}
		PersonDAO studentDAO = new StudentDAOImpl();
		Person student = studentDAO.getById(1);
		System.out.println(student);
		List<Person> students = (List<Person>) studentDAO.getAll();
		System.out.println(students);

		PersonDAO economistDAO = new EconomistDAOImpl();
		Person economist = economistDAO.getById(1);
		System.out.println(economist);
		List<Person> economists = (List<Person>) economistDAO.getAll();
		System.out.println(economists);

		ConverterUtil.toJSON(students, "src\\students.json");
/*Teacher t2 = ConverterUtil.toObject("src\\students.json");
*/		Teacher t = new Teacher();
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
