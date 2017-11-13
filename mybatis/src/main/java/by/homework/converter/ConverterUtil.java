package by.homework.converter;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

import by.homework.entity.Person;

public class ConverterUtil {

	public static void toJSON(Object o, String path) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(new File(path), o);

	}

	public static Person[] toObject(Class<?> c, String path) throws Exception {
		ObjectMapper mapper = new ObjectMapper();

		return (Person[]) mapper.readValue(new File(path), c);

	}
}