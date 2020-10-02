package com.xworkz.daotester;

import com.xworkz.lesson.dao.RocketDAO;
import com.xworkz.lesson.dao.RocketDAOImpl;
import com.xworkz.lesson.dto.RocketDto;

public class RocketDAOTester {

	public static void main(String[] args) {
		RocketDAO rocketdao=new RocketDAOImpl();
		RocketDto rocketdto=new RocketDto();
		
		rocketdto.setCost(1000.00);
		rocketdto.setLaunchstation("Shree Harikota");
		rocketdto.setOrganization("ISRO");
		rocketdto.setType("Launching Wehicle");
//		rocketdto.setRid(1);
		
//		rocketdao.deleteByCost("1000 crores");
//		rocketdao.findByType("SLV");
		rocketdao.insert(rocketdto);
//		rocketdao.updateCostByType("1000 crores", "GSLV");
//		rocketdto.setRid(1);
		
	}

}
