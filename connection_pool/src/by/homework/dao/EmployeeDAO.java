package by.homework.dao;

import java.sql.SQLException;
import java.util.List;

import com.homework.univercity.employees.Employee;

public interface EmployeeDAO {

	Employee getByID(long id) throws SQLException;

	List<Employee> getAll() throws SQLException;
}
