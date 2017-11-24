package by.homework.jaxb;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.log4j.Logger;

import by.homework.entity.Teacher;

public class ToObject {
	public static final Logger LOGGER = Logger.getLogger(ToObject.class);
	public static void main(String[] args) {

		try {

			File file = new File("src\\teacher.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Teacher.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Teacher teacher = (Teacher) jaxbUnmarshaller.unmarshal(file);
			System.out.println(teacher);

		} catch (JAXBException e) {
			LOGGER.error(e);
		}

	}
}
