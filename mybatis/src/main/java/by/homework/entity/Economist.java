package by.homework.entity;

public class Economist extends Person {

	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	private String role;

	@Override
	public String toString() {
		return "Economist [salary=" + salary + ", role=" + role + "]";
	}
	
}
