package com.xworkz.marshalling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

public class JaxbDemo {

	public static void main(String[] args) throws Exception {
		convertObjectToXml();
		convertXmlToObject();
	}
	private static void convertObjectToXml() throws JAXBException,PropertyException,FileNotFoundException
	{
		JAXBContext jaxbcontext=JAXBContext.newInstance(Employee.class);
		Marshaller marshaller=jaxbcontext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		Employee employee=new Employee(2, "Vinayak", 30000);
		marshaller.marshal(employee, new FileOutputStream("employee.xml"));
		
		System.out.println("emoloyee.xml is created succesfully");
	}
	
	private static void convertXmlToObject()
	{
		File file=new File("employee.xml");
		JAXBContext jaxbcontext;
		try {
			jaxbcontext = JAXBContext.newInstance(Employee.class);
		
		Unmarshaller unmarshaller=jaxbcontext.createUnmarshaller();
		Employee employee=(Employee)unmarshaller.unmarshal(file);
		System.out.println(employee);
		}catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
