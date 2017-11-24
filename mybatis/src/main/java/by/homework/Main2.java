package by.homework;

import java.time.LocalDate;

import by.homework.dao.AddressDAO;
import by.homework.dao.PersonDAO;
import by.homework.dao.impl.jdbc.AddressDAOImpl;
import by.homework.dao.impl.mybatis.EconomistDAOImpl;
import by.homework.entity.Address;
import by.homework.entity.Economist;

public class Main2 {

	public static void main(String[] args) {

	PersonDAO<Economist> economistDAO = new EconomistDAOImpl();
		Economist economist = new Economist();
		Address address = new Address();
		address.setId(4);

		/*economist.setAddress(address);
		economist.setAge(66);
		economist.setBirthDate(LocalDate.now());
		economist.setId(7);
		economist.setMobileNumber("1231254135135");
		economist.setName("Sir");
		economist.setSurname("Her");
		economist.setRole("Assistant");
		economist.setSalary(222);
		
		economistDAO.update(economist);*/
		
	AddressDAO addressDAO = new AddressDAOImpl();
		
	
		Address address1 = addressDAO.getById(1);
		addressDAO.delete(10);

		System.out.println(address1);
		
//		Address address2 = new Address();
//		address2.setCity("aaaaaa");
//		address2.setHouse(222221);
//		address2.setStreet("22222222");
		
//		addressDAO.create(address2);
		
/*Economist economist2 = new Economist();
//economist2.setAddress(address2);
economist2.setAge(666);
economist2.setBirthDate(LocalDate.now());
economist2.setMobileNumber("66666666");
economist2.setName("666");
economist2.setSurname("666");
economist2.setRole("Assistant");
economist2.setSalary(666);
economistDAO.create(economist2);*/
		
	}
}