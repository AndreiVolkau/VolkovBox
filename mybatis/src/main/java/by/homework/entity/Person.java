package by.homework.entity;

import java.time.LocalDate;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import by.homework.converter.LocalDateDeserializer;
import by.homework.converter.LocalDateSerializer;
import by.homework.jaxb.LocalDateAdapter;

@XmlRootElement
public abstract class Person {
	@XmlElement
	private long id;

	@XmlElement
	private String name;

	@XmlElement
	private String surname;

	@XmlJavaTypeAdapter(value = LocalDateAdapter.class)
	@XmlElement
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate birthDate;

	@XmlElement
	private int age;

	@XmlElement
	private String mobileNumber;

	@XmlElement
	private Address address;

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

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public long getAddressId() {
		return address.getId();
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", birthDate=" + birthDate + ", age="
				+ age + ", mobileNumber=" + mobileNumber + ", address=" + address + "]";
	}

}
