package by.homework.jaxb;

import java.io.File;
import java.text.ParseException;
import java.time.LocalDate;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.log4j.Logger;

import by.homework.entity.Specialisation;
import by.homework.entity.Teacher;

public class ToXML {
	public static final Logger LOGGER = Logger.getLogger(ToXML.class);
	public static void main(String[] args) throws ParseException {
		Teacher t1 = new Teacher();
		t1.setAge(25);
		t1.setCategory(1);
		t1.setSpecialisation(Specialisation.MATH_TEACHER);
		t1.setBirthDate(LocalDate.parse("2015-02-20"));
		t1.setId(1);
		t1.setMobileNumber("+375293169128");
		t1.setName("Vasya");
		t1.setPublicationsNumber(1);
		t1.setSurname("Pupkin");
		t1.setWorkExperience(1);
		System.out.println(t1);
		try {

			File file = new File("src\\teacher.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Teacher.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(t1, file);
			jaxbMarshaller.marshal(t1, System.out);

		} catch (JAXBException e) {
			LOGGER.error(e);
		}

	}
}