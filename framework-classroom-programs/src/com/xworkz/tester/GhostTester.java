package com.xworkz.tester;


import java.util.Date;

import com.xworkz.dto.GhostDTO;
import com.xworkz.service.GhostService;
import com.xworkz.service.GhostServiceImpl;
import com.xworkz.singltonsf.SFSingleton;

public class GhostTester {

	public static void main(String[] args) {
		System.out.println("Start of main method");
		try {
			
			Date d=new Date();
			d.setYear(-100);
			d.setDate(10);
			d.setMonth(12);
//			d.se
		GhostDTO gdto=new GhostDTO("young","cruel",'M',d,"white",true);
		
//		GhostDAO gdao=new GhostDAOImpl();
//		gdao.create(gdto);
		
		GhostService gservice=new GhostServiceImpl();
		gservice.validateCreate(gdto);
//		gservice.ValidateUpdateDangerBYId(2, false);
//		gservice.validateDeleteById(2);
//		gservice.validateUpdateGenderAndDateById('F', d, 1);
		}
		finally {
			SFSingleton.closeSF();
		System.out.println("End of main method");
	}
	}

}
