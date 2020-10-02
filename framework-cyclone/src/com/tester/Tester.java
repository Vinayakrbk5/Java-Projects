package com.tester;

import java.util.ArrayList;

import com.xworkz.dao.CycloneDAO;
import com.xworkz.dao.CycloneDAOImpl;
import com.xworkz.dto.CycloneDTO;
import com.xworkz.singleton.SFSingleton;

public class Tester {

	public static void main(String[] args) {
//		CycloneDTO dto= new CycloneDTO();
//		dto.setDesastermanagement(true);
//		dto.setareaAfftected(19.8);
//		dto.setName("Cyclone");
//		dto.setSpeed(100);
//		dto.setCid(1);
		
		System.out.println("Start: main method");
		ArrayList<CycloneDTO> arrlist=new ArrayList<>();
		arrlist.add(new CycloneDTO(50, "Hurricanes", false, 48.9));
		arrlist.add(new CycloneDTO(100, "typhoons", true, 100.9));
		
		CycloneDAO dao=new CycloneDAOImpl();
//		dao.create(dto);
		
		dao.saveList(arrlist);
		
//		 CycloneDTO cdto=dao.fetchById(1);
//		 
//		 System.out.println(cdto);
		
//		dao.updateAreaAffetctedById(89.098, 1);
		
//		dao.deleteById(2);
//		dao.updateAreaAffetctedAndDisasterManagementById(250.87, true, 1);
		
//		dao.updateNameById("Hurricanes", 1);
		try {
		SFSingleton.closeSF();
		}
		catch(Exception e)
		{
			System.err.println("Something went wrong in SFSingleton class");
		}
		System.out.println("End : main method");
	}
	

}
