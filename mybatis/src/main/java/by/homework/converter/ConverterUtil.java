package by.homework.converter;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.ObjectMapper;

public class ConverterUtil {

	public static void toJSON(Object o, String path) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			System.out.println(mapper.writeValueAsString(o));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
