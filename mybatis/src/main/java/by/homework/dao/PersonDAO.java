package by.homework.dao;

import java.util.List;

import by.homework.entity.Person;

public interface PersonDAO<T extends Person> {
	Person getById(long id);

	List<? extends Person> getAll();

	void create(T person);

	void update(T person);

	void delete(long id);
}
