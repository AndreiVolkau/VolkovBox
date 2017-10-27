package by.homework.entity;

import java.lang.reflect.Method;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

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
	@XmlElement
	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}

	public int getCategory() {
		return category;
	}
	@XmlElement
	public void setCategory(int category) {
		this.category = category;
	}

	public Specialisation getSpecialisation() {
		return specialisation;
	}
	@XmlElement
	public void setSpecialisation(Specialisation specialisation) {
		this.specialisation = specialisation;
	}

	public int getPublicationsNumber() {
		return publicationsNumber;
	}
	@XmlElement
	public void setPublicationsNumber(int publicationsNumber) {
		this.publicationsNumber = publicationsNumber;
	}

	@Override
	public String toString() {
		return "Teacher [students=" + students + ", workExperience=" + workExperience + ",  publicationsNumber="
				+ publicationsNumber + ", category=" + category + ", specialisation=" + specialisation + ", "
				+ super.toString() + "]";
	}

	public Method[] getMethods() {
		Method[] method = null;
		// TODO Auto-generated method stub
		return method;
	}

}
