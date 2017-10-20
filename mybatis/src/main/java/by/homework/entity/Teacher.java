package by.homework.entity;

import java.util.List;

public class Teacher extends Person {

	List<Student> students;

	private int workExperience;

	private int publicationsNumber;

	private int category;

	private Specialisation specialisation;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public Specialisation getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(Specialisation specialisation) {
		this.specialisation = specialisation;
	}

	public int getPublicationsNumber() {
		return publicationsNumber;
	}

	public void setPublicationsNumber(int publicationsNumber) {
		this.publicationsNumber = publicationsNumber;
	}

	@Override
	public String toString() {
		return "Teacher [students=" + students + ", workExperience=" + workExperience + ", publicationsNumber="
				+ publicationsNumber + ", category=" + category + ", specialisation=" + specialisation + ", toString()="
				+ super.toString() + "]";
	}

}
