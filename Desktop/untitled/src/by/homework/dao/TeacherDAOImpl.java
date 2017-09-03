package by.homework.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.homework.univercity.employees.Employee;
import com.homework.univercity.employees.Teacher;

import by.homework.ConnectionPool;

public class TeacherDAOImpl implements EmployeeDAO {

	@Override
	public Employee getByID(long id) throws SQLException {

		Employee empl = null;
		ConnectionPool pool = ConnectionPool.getConnectionPool();

		Connection conn = pool.getConnection();
		PreparedStatement pst = conn.prepareStatement("select name, surname, age, mobilenumber, birthdate from MyDb.employees where idEmployee = ?");
		pst.setLong(1, id);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			empl = new Teacher();
			String name = rs.getString(1);
			//String surname = rs.getString(1);
			empl.setName(name);
			/*	empl.setSurname(surname);
				int age = rs.getInt(1);
				empl.setAge(age);
				String MobileNumber = rs.getString(1);
				empl.setMobileNumber(MobileNumber); 
				Date birthdate = rs.getDate(1);
				empl.setBirthDate(birthdate);*/
			
		}

		pool.releaseConnection(conn);
		return empl;
	}

	@Override
	public List<Employee> getAll() {
		return null;
	}

}
// surname, age, mobilenumber, birthdate, workexperience