package by.homework.dao;

import java.util.List;

import by.homework.entity.Economist;

public interface EconomistDAO {
	

		Economist getById(long id);

		List<Economist> getAll();
	}


