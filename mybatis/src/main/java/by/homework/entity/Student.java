package by.homework.entity;

public class Student  extends Person {
	
	private int courseNumber;
	
	private int scholarship;
	
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
		return "Student [courseNumber=" + courseNumber + ", scholarship=" + scholarship + ", facultyName=" + facultyName
				+ ", toString()=" + super.toString() + "]";
	}
	
}
