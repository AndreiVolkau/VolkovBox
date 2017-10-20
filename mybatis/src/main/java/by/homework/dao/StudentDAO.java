package by.homework.dao;

import java.util.List;

import by.homework.entity.Student;


public interface StudentDAO {

	Student getById(long id);

	List<Student> getAll();
}
