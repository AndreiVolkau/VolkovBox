package com.homework.univercity.xmlParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxXMLReader {
	 public static void main(String[] args) {
	        String fileName = "src\\com\\homework\\univercity\\xmlParser\\Employees.xml";
	        List<Employee1> empList = parseXML(fileName);
	        for(Employee1 emp : empList){
	            System.out.println(emp.toString());
	        }
	    }

	    private static List<Employee1> parseXML(String fileName) {
	        List<Employee1> empList = new ArrayList<>();
	        Employee1 emp = null;
	        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
	        try {
	            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
	            while(xmlEventReader.hasNext()){
	                XMLEvent xmlEvent = xmlEventReader.nextEvent();
	               if (xmlEvent.isStartElement()){
	                   StartElement startElement = xmlEvent.asStartElement();
	                   if(startElement.getName().getLocalPart().equals("employee")){
	                       emp = new Employee1();
	                     
	                       Attribute idAttr = startElement.getAttributeByName(new QName("id"));
	                       if(idAttr != null){
	                       emp.setId(Integer.parseInt(idAttr.getValue()));
	                       }
	                   }
	                  
	                   else if(startElement.getName().getLocalPart().equals("birthDate")){
	                       xmlEvent = xmlEventReader.nextEvent();
	                       emp.setBirthDate(xmlEvent.asCharacters().getData());
	                   }else if(startElement.getName().getLocalPart().equals("age")){
	                       xmlEvent = xmlEventReader.nextEvent();
	                       emp.setAge(Integer.parseInt(xmlEvent.asCharacters().getData()));
	                   }else if(startElement.getName().getLocalPart().equals("name")){
	                       xmlEvent = xmlEventReader.nextEvent();
	                       emp.setName(xmlEvent.asCharacters().getData());
	                   }else if(startElement.getName().getLocalPart().equals("surname")){
	                       xmlEvent = xmlEventReader.nextEvent();
	                       emp.setSurname(xmlEvent.asCharacters().getData());
	                   }else if(startElement.getName().getLocalPart().equals("mobileNumber")){
	                       xmlEvent = xmlEventReader.nextEvent();
	                       emp.setMobileNumber(xmlEvent.asCharacters().getData());
	                   }else if(startElement.getName().getLocalPart().equals("numberOfSubordinates")){
	                       xmlEvent = xmlEventReader.nextEvent();
	                       emp.setNumberOfSubordinates(Integer.parseInt(xmlEvent.asCharacters().getData()));
	                   }else if(startElement.getName().getLocalPart().equals("workExperience")){
	                       xmlEvent = xmlEventReader.nextEvent();
	                       emp.setWorkExperience(xmlEvent.asCharacters().getData());
	                       
	                       
	                       
	                   }else if(startElement.getName().getLocalPart().equals("numberOfPublications")){
	                       xmlEvent = xmlEventReader.nextEvent();
	                       emp.setNumberOfPublications(Integer.parseInt(xmlEvent.asCharacters().getData()));
	                   }
	               }
	             
	               if(xmlEvent.isEndElement()){
	                   EndElement endElement = xmlEvent.asEndElement();
	                   if(endElement.getName().getLocalPart().equals("employee")){
	                       empList.add(emp);
	                   }
	               }
	            }
	            
	        } catch (FileNotFoundException | XMLStreamException e) {
	            e.printStackTrace();
	        }
	        return empList;
	    }

	}

