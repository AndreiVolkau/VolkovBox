package by.homework.teacher;

import java.util.Date;
import java.util.List;

import by.homework.student.Student;

public class Teacher  {

	private long id; 
	
	private String name;

	private String surname;

	private Date birthDate;

	private int age;
	
	private String mobileNumber;

	List<Student> students;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\nTeacher [id=" + id + ", name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", age="
				+ age + ", mobileNumber=" + mobileNumber + ", \nstudents=" + students + "]";
	}

}
