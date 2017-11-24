package by.homework.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Teacher extends Person {

	private List<Student> students;

	@XmlElement
	private int workExperience;

	@XmlElement
	private int publicationsNumber;

	@XmlElement
	private int category;

	@XmlElement
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
		String studentsStr = "";
		for (Student student : students) {
			studentsStr += student.toString();
		}
		return super.toString() + "Teacher [workExperience=" + workExperience + ", publicationsNumber="
				+ publicationsNumber + ", category=" + category + ", specialisation=" + specialisation + "]"
				+ "\nStudents:" + studentsStr + "\n";

	}

}
