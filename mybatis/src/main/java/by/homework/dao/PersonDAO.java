package by.homework.dao;

import java.util.List;

import by.homework.entity.Person;

public interface PersonDAO {
	Person getById(long id);

	List<? extends Person> getAll();
}
