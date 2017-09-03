package com.homework.univercity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import com.homework.univercity.employees.Employee;
import com.homework.univercity.employees.Student;
import com.homework.univercity.employees.Teacher;
import com.homework.univercity.employees.administration.Economist;
import com.homework.univercity.employees.students.Bacalavr;
import com.homework.univercity.employees.students.Magistr;
import com.homework.univercity.employees.teachers.MathTeacher;
import com.homework.univercity.employees.teachers.PhysicsTeacher;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	
	private static final Logger LOG = LogManager.getLogger(Main.class);
	
	public static Employee populateEmployee(Employee e, String name, String surname, int age, String mobileNumber,
			String workExperience, int numberOfPublications, int numberOfSubordinates, String birthDate) {
		e.setName(name);
		e.setSurname(surname);
		e.setAge(age);
		e.setMobileNumber(mobileNumber);
		e.setWorkExperience(workExperience);
		e.setNumberOfPublications(numberOfPublications);
		e.setNumberOfSubordinates(numberOfSubordinates);
		e.setBirthDate(birthDate);
		return e;
	}

	public static void printNamesWithBirthdays(List<Employee> employeeList) {
		StringBuilder names = new StringBuilder();
		for (Employee employee : employeeList) {
			names.append(employee.getName());
			names.append("-");
			names.append(employee.getBirthDateAsString());
			names.append(" ");

		}
	
		LOG.info(names);
	}

	public static void increaseBirthDate(Employee e, int increaseBy) {
		Date d = e.getBirthDate();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.DATE, increaseBy);
		e.setBirthDate(cal.getTime());
	}

	public static void compareEmployees(Employee e1, Employee e2) {

		LOG.warn("Employees are equal:" + e1.equals(e2));

	}

	public static void main(String[] args) {

		Employee teacher = new Teacher();
		Employee student = new Student();

		Employee mathteacher = populateEmployee(new MathTeacher(), "Vitya", "Perec", 44, "+375296065676",
				"Twenty years", 5, 2, "01/01/1970");
		increaseBirthDate(mathteacher, 10);

		Employee physicsteacher = populateEmployee(new PhysicsTeacher(), "Don", "Pedro", 23, "+375255455569",
				"Nineteen years", 4, 12, "03/05/1989");
		increaseBirthDate(physicsteacher, 10);

		Employee economist = populateEmployee(new Economist(), "Nicolas", "Cage", 23, "+375255556698", "Twenty years",
				0, 0, "02/04/1988");
		increaseBirthDate(economist, 10);

		Employee bacalavr = populateEmployee(new Bacalavr(), "Igor", "Pigor", 33, "+375172233521", "Two years", 0, 0,
				"01/01/1990");
		increaseBirthDate(bacalavr, 10);

		Employee magistr = populateEmployee(new Magistr(), "Vasya", "Pupkin", 54, "+375172233521", "Twenty two years",
				23, 5, "01/02/1959");
		increaseBirthDate(magistr, 10);

		compareEmployees(mathteacher, physicsteacher);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(bacalavr);
		employeeList.add(mathteacher);
		employeeList.add(magistr);
		employeeList.add(economist);
		employeeList.add(physicsteacher);
		printNamesWithBirthdays(employeeList);

		startWorking(teacher);
		startWorking(student);
		startWorking(economist);
		startWorking(mathteacher);
		startWorking(physicsteacher);
		startWorking(bacalavr);
		startWorking(magistr);
	}

	public static void startWorking(Workable w) {
		w.work();
	}

}
