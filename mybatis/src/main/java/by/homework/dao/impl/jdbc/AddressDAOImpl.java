package by.homework.dao.impl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import by.homework.dao.AddressDAO;
import by.homework.dao.dbpool.ConnectionPool;
import by.homework.entity.Address;

public class AddressDAOImpl implements AddressDAO {

	@Override
	public void create(Address address) {
		ConnectionPool pool = ConnectionPool.getConnectionPool();
		Connection conn = pool.getConnection();

		try {
			PreparedStatement pst = conn
					.prepareStatement("insert into teacherdb.address ( city , street, house) values (?,?,?)");
			pst.setString(1, address.getCity());
			pst.setString(2, address.getStreet());
			pst.setInt(3, address.getHouse());

			int rowsUpdated = pst.executeUpdate();
			if (rowsUpdated > 1) {
				throw new SQLException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pool.releaseConnection(conn);
		}
	}

	@Override
	public Address getById(long id) {
		Address address = null;
		ConnectionPool pool = ConnectionPool.getConnectionPool();
		Connection conn = pool.getConnection();

		try {
			PreparedStatement pst = conn
					.prepareStatement("select id, city, street, house from teacherdb.address where id = ?");
			pst.setLong(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				address = new Address();
				address.setId(rs.getLong("id"));
				address.setCity(rs.getString("city"));
				address.setStreet(rs.getString("street"));
				address.setHouse(rs.getInt("house"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pool.releaseConnection(conn);
		}
		return address;

	}

	@Override
	public void update(Address address) {
		ConnectionPool pool = ConnectionPool.getConnectionPool();
		Connection conn = pool.getConnection();

		try {
			PreparedStatement pst = conn
					.prepareStatement("update teacherdb.address set city=? ,street=?, house=? where id = ?");
			pst.setString(1, address.getCity());
			pst.setString(2, address.getStreet());
			pst.setInt(3, address.getHouse());
			pst.setLong(4, address.getId());

			int rowsUpdated = pst.executeUpdate();
			if (rowsUpdated > 1) {
				throw new SQLException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pool.releaseConnection(conn);
		}
	}

	@Override
	public void delete(long id) {
		ConnectionPool pool = ConnectionPool.getConnectionPool();
		Connection conn = pool.getConnection();

		try {
			PreparedStatement pst = conn.prepareStatement("delete from teacherdb.address where id = ?");
			pst.setLong(1, id);
			int rowsUpdated = pst.executeUpdate();
			if (rowsUpdated > 1) {
				throw new SQLException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pool.releaseConnection(conn);
		}

	}

}
