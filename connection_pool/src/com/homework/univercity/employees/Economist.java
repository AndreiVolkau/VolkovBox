package com.homework.univercity.employees;

import com.homework.univercity.employees.Employee;

public class Economist extends Employee {

private int category;	
	
	public void work() {
		LOG.warn("Economist is counting money");
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}
}
