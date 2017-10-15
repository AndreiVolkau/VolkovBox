package by.homework;

import java.util.List;

import by.homework.teacher.Teacher;
import by.homework.teacher.TeacherDAO;

public class Main {
	
	public static void main(String[] args) {
		TeacherDAO teacherDAO = new TeacherDAO();
		List<Teacher> teachers = teacherDAO.getAll();
		System.out.println(teachers);
		
		System.out.println("\nby id:");
		Teacher teacher = teacherDAO.getById(1);
		System.out.println(teacher);
	}

}
