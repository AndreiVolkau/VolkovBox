package by.homework.jaxb;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import by.homework.entity.Specialisation;
import by.homework.entity.Teacher;

public class JAXBExample {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy");
		Teacher t1 = new Teacher();
		t1.setAge(25);
		t1.setCategory(1);
		t1.setSpecialisation(Specialisation.MATH_TEACHER);
		t1.setBirthDate(dateformat.parse("12-12-1990"));
		t1.setId(1);
		t1.setMobileNumber("+375293169128");
		t1.setName("Vasya");
		t1.setPublicationsNumber(1);
		t1.setSurname("Pupkin");
		t1.setWorkExperience(1);
		try {

			File file = new File("src\\teacher.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Teacher.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(t1, file);
			jaxbMarshaller.marshal(t1, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}
}