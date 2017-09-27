package com.homework.univercity.employees;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;





public abstract class Employee  {

	public static final Logger LOG = LogManager.getLogger(Employee.class);

	private Date birthDate;

	private int age;

	private String name;

	private String surname;

	private String mobileNumber;

	private int numberOfSubordinates;

	private String workExperience;

	private int numberOfPublications;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((mobileNumber == null) ? 0 : mobileNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfPublications;
		result = prime * result + numberOfSubordinates;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		result = prime * result + ((workExperience == null) ? 0 : workExperience.hashCode());
		return result;
	}

	@Override

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;		
		return true;
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

	public int getNumberOfSubordinates() {
		return numberOfSubordinates;
	}

	public void setNumberOfSubordinates(int numberOfSubordinates) {
		this.numberOfSubordinates = numberOfSubordinates;
	}

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

	public String getBirthDateAsString() {
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		return formatter.format(birthDate);
	}

	public Date getBirthDate() {

		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setBirthDate(String birthDate) {
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		try {
			Date parsedDate = (Date) formatter.parse(birthDate);
			this.birthDate = parsedDate;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Employee [birthDate=" + birthDate + ", age=" + age + ", name=" + name + ", surname=" + surname
				+ ", mobileNumber=" + mobileNumber + ", numberOfSubordinates=" + numberOfSubordinates
				+ ", workExperience=" + workExperience + ", numberOfPublications=" + numberOfPublications + "]";
	}


}
