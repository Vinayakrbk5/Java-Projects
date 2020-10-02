package com.xworkz.daotester;

import java.text.DateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

import com.xworkz.lesson.dao.VirusDAO;
import com.xworkz.lesson.dao.VirusDAOImpl;
import com.xworkz.lesson.dto.VirusDto;

public class VirusDaoTester {

@SuppressWarnings("deprecation")
public static void main(String[] args) {
	VirusDAO virusdao=new VirusDAOImpl();
	VirusDto virusdto=new VirusDto();
	
//	DateFormatter dt=new DateFormatter();
//	DateFormat date="20/12/2019";
//	dt.setFormat(date);
	
	Date d=new Date();
	d.setYear(120);
	d.setDate(9);
	d.setMonth(5);
	d.setMinutes(58);
	d.setHours(15);
	
	virusdto.setName("Covid-19");
	virusdto.setOrigin("Wuhan");
	virusdto.setSize("Macro");
	virusdto.setKilledtillnow(10000);
	virusdto.setSpreadtype("Virul-through");
	virusdto.setStartDate(d);
//	virusdto.setVid(1);
	
//	virusdao.deleteById(3);
//	virusdao.findByName("Covid-19");
	virusdao.insert(virusdto);
//	virusdao.updateNameById("covid-25",7);
	
	
	
//	System.out.println("Virus Name :"+virusdto.getName());
//	System.out.println("Origin :"+virusdto.getOrigin());
//	System.out.println("Size :"+virusdto.getSize());
//	System.out.println("Killed till now :"+virusdto.getKilledtillnow());
//	System.out.println("Spreading through :"+virusdto.getSpreadtype());
}
}
