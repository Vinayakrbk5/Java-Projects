package com.xworkz.daotester;

import com.xworkz.lesson.dao.MassagerDAO;
import com.xworkz.lesson.dao.MassagerDAPImpl;
import com.xworkz.lesson.dto.MassagerDto;

public class MassagerDAOTester {

	public static void main(String[] args) {
		MassagerDAO massagerdao=new MassagerDAPImpl();
		MassagerDto massdto=new MassagerDto();
		massdto.setType("Electronics");
		massdto.setUsedfor("Body Massage");
		massdto.setPricerange("500 to 5000");
//		massdto.setMid(1);
		
		massagerdao.deleteByType("Electronics");
		massagerdao.findByType("Electronics");
		massagerdao.insert(massdto);
		massagerdao.updatePriceRangeByType("10000", "Electronics");
		
		System.out.println("Massager is a type of "+massdto.getType()+" device");
		System.out.println("Massager is used for "+massdto.getUsedfor());
		System.out.println("Massager price ranges from "+massdto.getPricerange());
	}

}
