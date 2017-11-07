package by.homework.entity;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import by.homework.jaxb.LocalDateAdapter;

@XmlRootElement
public abstract class Person {

	private long id;

	private String name;

	private String surname;

	private LocalDate birthDate;

	private int age;

	private String mobileNumber;

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	@XmlElement
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	@XmlElement
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	@XmlElement
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public long getId() {
		return id;
	}

	@XmlElement
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", age=" + age
				+ ", mobileNumber=" + mobileNumber;
	}

}
