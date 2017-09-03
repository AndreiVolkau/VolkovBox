package by.homework.dao;

import java.sql.SQLException;

import com.homework.univercity.employees.Employee;

public class Main2 {
	public static void main(String[] args) throws SQLException {
		EmployeeDAO dao = new TeacherDAOImpl();
		Employee empl = dao.getByID(1);
		if(empl != null) {
			System.out.println(empl);
		}
	}
}
