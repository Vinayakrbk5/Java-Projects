package com.xworkz.daotester;

import com.xworkz.cableservice.CableServiceForCheck;
import com.xworkz.cableservice.CableServiceForCheckImpl;
import com.xworkz.lesson.dto.CableDto;
import com.xworkz.singleton.Singleton;

public class CableTester {

	public static void main(String[] args) {
		try {
			System.out.println("Start of main method");

			CableDto cabledto = new CableDto();
			cabledto.setType("Communicator");
			cabledto.setUsedfor("Communication purpose");
			cabledto.setContent("Metal");

			CableServiceForCheck cabelservice = new CableServiceForCheckImpl();
//			CableDto cdto=cabelservice.validateFindById("Xworkz_4");
//			System.out.println(cdto);
//			cabelservice.validateDeleteByid("Xworkz_1");
//			cabelservice.validateUpdatecontentById("Plastic", "Xworkz_2");
			cabelservice.validateInsert(cabledto);

		} catch (Exception e) {

			System.err.println("Some thing went wrong in closing Session Factory");
		} finally {
			Singleton.closeSF();
		}

		System.out.println("End of main method");
	}

}
