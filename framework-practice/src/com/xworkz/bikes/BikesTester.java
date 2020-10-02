package com.xworkz.bikes;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.singleton.SFSingleton;

public class BikesTester {

	public static void main(String[] args) {
		try {
		System.out.println("Start : Main method");
		BikesDTO bDto=new BikesDTO();
		bDto.setBrandName("Royal Enfield");
		bDto.setBikeCC(350);
		bDto.setPrice(135000.00);
		
		BikesDAO bDao=new BikesDAOImpl();
//		bDao.saveRecords(bDto);
		
//		BikesDTO bDto1=bDao.fetchAll(3);
//		System.out.println(bDto1);
		
		//delete operation
//		bDao.deleteById(5);
		
		// update single value operation
//		bDao.updateBrandNameById("UM", 4);
		
		// update multiple values operation
//		bDao.updatePriceAndBikeCCById(105000.00, 150, 2);
		
		// fetching multiple rows by sending multiple id's using list
//		List<Integer> intList=new ArrayList<>();
//		ArrayList<BikesDTO> arrList;
//		for(int i=1;i<5;i++) {
//		intList.add(i);
//		}
//		System.out.println(intList);
//		arrList=(ArrayList<BikesDTO>) bDao.fetch(intList);
//		arrList.forEach(p->System.out.println(p));
		
		List<BikesDTO> bdto=new ArrayList<>();
		bdto.add(new BikesDTO("Discover", 85000.00, 125));
		bdto.add(new BikesDTO("Honda-Unicorn", 100000.00, 150));
		bdto.add(new BikesDTO("Duke", 150000.00, 250));
		
		bDao.saveRecords(bdto);
		
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			SFSingleton.closeSF();
		}
		System.out.println("End : Main method");
	}

}
