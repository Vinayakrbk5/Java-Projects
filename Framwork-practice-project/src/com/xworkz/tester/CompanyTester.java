package com.xworkz.tester;

import java.util.ArrayList;

import com.xworkz.DAO.CompanyDAO;
import com.xworkz.DAO.CompanyDAOImpl;
import com.xworkz.dto.CompanyDTO;

public class CompanyTester {

public static void main(String[] args) {
	
	ArrayList<CompanyDTO> arrlist=new ArrayList<>();
	arrlist.add(new CompanyDTO("M_Soft",3000,"Bill Gate",1002));
	arrlist.add(new CompanyDTO("Google",2000,"Sundar Pichie",1010));
	arrlist.add(new CompanyDTO("Infosys",2500,"NarayanaMurthy",2010));
	
	
//	CompanyDTO compdto=new CompanyDTO();
//	compdto.setCid(1001);
//	compdto.setCompanyName("Google");
//	compdto.setCompanyCEO("Sundar Pichai");
//	compdto.setGrossProfit(2000);
	
	CompanyDAO compdao=new CompanyDAOImpl();
	for(CompanyDTO cdto:arrlist)
	{
	compdao.create(cdto);
	}
	compdao.readAll();
}
}
