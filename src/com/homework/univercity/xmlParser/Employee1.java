package com.homework.univercity.xmlParser;

public class Employee1 {

	private int id;
	private String birthDate;
	private int age;
	private String name;
	private String surname;
	private String mobileNumber;
	private int numberOfSubordinates;
	private String workExperience;
	private int numberOfPublications;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfSubordinates() {
		return numberOfSubordinates;
	}

	public void setNumberOfSubordinates(int numberOfSubordinates) {
		this.numberOfSubordinates = numberOfSubordinates;
	}

	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

	public String toString() {
		return "Employee :: id =" + this.id + " birthDate " + this.birthDate + " age " + this.age +  " name " + this.name
				+ " surname " + this.surname +  " mobileNumber " + this.mobileNumber + " numberOfSubordinates "
				+ this.numberOfSubordinates + " workExperience " + this.workExperience + " numberOfPublications "
				+ this.numberOfPublications;
	}

}