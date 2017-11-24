package by.homework.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student extends Person {
	@XmlElement
	private int courseNumber;
	@XmlElement
	private int scholarship;
	@XmlElement
	private String facultyName;

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getScholarship() {
		return scholarship;
	}

	public void setScholarship(int scholarship) {
		this.scholarship = scholarship;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	@Override
	public String toString() {
		return  "\n" +  super.toString()  + "Student [courseNumber=" + courseNumber + ", scholarship=" + scholarship
				+ ", facultyName=" + facultyName + "]";
	}

}
