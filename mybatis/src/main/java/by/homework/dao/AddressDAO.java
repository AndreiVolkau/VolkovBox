package by.homework.dao;

import by.homework.entity.Address;

public interface AddressDAO {
	Address getById(long id);

	void update(Address address);

	void delete(long id);
	
	void create(Address address);
}
