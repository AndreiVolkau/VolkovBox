package by.homework.dao;

import java.util.List;

import by.homework.entity.Teacher;

public interface TeacherDAO {

	Teacher getById(long id);

	List<Teacher> getAll();
}
