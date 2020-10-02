package com.xworkz.laptop;

import java.util.ArrayList;
import java.util.List;

import org.dom4j.CDATA;

import com.xworkz.singleton.SFSingleton;

public class LaptopTester {

	public static void main(String[] args) {
		System.out.println("Start :main method");
		try {
			List<LaptopDTO> arrList = new ArrayList<>();

			arrList.add(new LaptopDTO("HP", 30000));
			arrList.add(new LaptopDTO("Dell", 50000));
			arrList.add(new LaptopDTO("Lenovo", 25000));

			LaptopDAO lapDao = new LaptopDAOImpl();
//			lapDao.save(arrList);
			
//			lapDao.fetchById("Vinay01");
//			System.out.println(dto);
			
//			List<LaptopDTO> list=lapDao.fetchAll();
//			list.forEach(p->System.out.println(p));
			
//			lapDao.fetchBrandName();
			
//			lapDao.updateBrandNameById("Opera", 4);
			LaptopDTO dto=new LaptopDTO();
			dto.setBrand("Call");
//			dto.setlId(14);
			dto.setPrice(10001);
			lapDao.insert(dto);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SFSingleton.closeSF();
		}
		System.out.println("End : main method");
	}

}
