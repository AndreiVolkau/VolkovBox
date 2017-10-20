package by.homework.converter;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

public class ConverterUtil {

	public static void toJSON(Object o, String path) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			mapper.writeValue(new File(path), o);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
