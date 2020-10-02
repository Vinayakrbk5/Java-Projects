package com.xworkz.tester;


import com.xworkz.dao.SanitizerDAO;
import com.xworkz.dao.SanitizerDAOImpl;
import com.xworkz.dto.SanitizerDTO;
import com.xworkz.service.SanitizerService;
import com.xworkz.service.SanitizerServiceImpl;
import com.xworkz.singltonsf.SFSingleton;

public class SanitizerTester {

	public static void main(String[] args) {
		try {
		SanitizerService sanService=new SanitizerServiceImpl();
		SanitizerDAO sdao=new SanitizerDAOImpl();
		SanitizerDTO sdto=sdao.fetchByBrandName("Dettol");
		System.out.println(sdto);
		}
		finally {
			SFSingleton.closeSF();
		}
	}

}
