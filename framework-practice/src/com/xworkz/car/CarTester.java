package com.xworkz.car;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.singleton.SFSingleton;

public class CarTester {

	public static void main(String[] args) {
		try {
		CarDTO cdto=new CarDTO();
		List<CarDTO> list=new ArrayList<>();
		list.add(new CarDTO("Maruthi", 400000.0));
		list.add(new CarDTO("Benz", 1000000.0));
		list.add(new CarDTO("Toyoto", 1500000.0));
		
		CarDAO cdao=new CarDAOImpl();
//		cdao.save(list);
		
//		CarDTO cdto1=cdao.fetchBYBrnadName("Benz");
//		System.out.println(cdto1);
		
		CarDTO cdto2=cdao.fetchByPrice(400000.0);
		System.out.println("In Main Method \n "+cdto2);
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			SFSingleton.closeSF();
		}
	}
}
