package com.xworkz.tester;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xworkz.dao.SanitizerDAO;
import com.xworkz.dao.SanitizerDAOImpl;
import com.xworkz.dto.SanitizerDTO;
import com.xworkz.sanitizerservice.SanitizerService;
import com.xworkz.sanitizerservice.SanitizerServiceImpl;
import com.xworkz.singleton.SFSingleton;

public class SanitizerTester {

	public static void main(String[] args) {
		try {

			System.out.println("Start of main method");
			SanitizerDTO sdto = new SanitizerDTO();

//			SanitizerDAO sdao = new SanitizerDAOImpl();
//			sdto = sdao.fetchByBrandName("Vibes");
//			System.out.println("Result from servive Class"+sdto);

			SanitizerService servicedao = new SanitizerServiceImpl();
//			sdto = servicedao.validateFetchByBrandName("Vibes");
//			sdto = servicedao.validateFetchByBrandNameAndQuantity("Vibes", 80);
//			System.out.println("Result from validateFetchByBrandNameAndQuantity() method is :\n"+sdto);

//			String brandName = servicedao.validateFetchBrandNameByIdAndQuantity(4, 40);
//			System.out.println("BrandName for id 4  from validateFetchBrandNameByIdAndQuantity() method is :" + brandName);

//			Integer id = servicedao.validateFetchIdByQuantityAndBrandName(40, "Appollo");
//			System.out.println("Fetched id from validateFetchIdByQuantityAndBrandName() method is :" + id);

			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//			String strDate = "2020/4/16";
			Date date = new Date();
			date.setMonth(3);
			date.setYear(120);
			date.setDate(16);
//			date.setHours(0);
//			date.setMinutes(0);
//			date.setSeconds(0);
			
//			System.out.println("before formatting :" + date);
			
//			String newDate = dateFormat.format(date);
//			System.out.println("after formatting :" + newDate);
			
//			Date dateFormat1 = dateFormat.parse(newDate);
//			System.out.println("after Parsing :" + dateFormat1);

//			sdto = servicedao.validateFetchByBrandNameAndMFGDate("Appollo", dateFormat1);
//			System.out.println("Result from fetchByBrandNameAndMFGDate() method is :\n" + sdto);

//			Long rowCount = servicedao.validateFetchCount();
//			System.out.println("Table has Total " + rowCount + " rows");
//
//			Long rCount = servicedao.validateFetchCountByPrice(new Double(25));
//			System.out.println(rCount + " row has price as 30/-");
//
//			Double maxPrice = servicedao.validateFetchMaxByPrice();
//			System.out.println("Maximum price amoung brands is " + maxPrice);
//
//			Double totalPrice = servicedao.validateFetchSumByPrice();
//			System.out.println("Sum of prices of total brands is " + totalPrice);
//
//			Double secMax = servicedao.validateFetchSecondMaxByPrice();
//			System.out.println("Second maximum price of the Sanitizer brand is " + secMax);

//			int id = 1;
//			@SuppressWarnings("unchecked")
//			ArrayList<Object> arrList = (ArrayList<Object>) servicedao.validateFetchBrandAndPriceById(id);
//			if (arrList.size() != 0) {
//				System.out.println("Sanitizer Brand Name for id= " + id + " is " + arrList.get(0));
//				System.out.println("Sanitizer Price for " + id + " is " + arrList.get(1));
//			} else {
//				System.out.println("Object returned is null");
//			}
//			Object[] obj=(Object[]) servicedao.validateFetchBrandAndPriceById(id);
//			System.out.println("brand name="+obj[0]);
//			System.out.println("It's price "+obj[1]);

//			Date date1=new Date();
//			System.out.println(date1);
//			date1.setDate(15);// 
//			date1.setMonth(1);// +1
//			date1.setYear(120);// 1900+120,1875-> 1900-25=1875

//			SimpleDateFormat formatDate=new SimpleDateFormat("yyyy/MM/dd");
//			String date=formatDate.format(date1);

//			String date=""";
//			String date="15/2/2020";

//			SanitizerDTO dto=servicedao.validateFetchByBrandNameAndMFGDate("dettol", date);
//			System.out.println(dto);
			
			List<SanitizerDTO> list=servicedao.validateFetchAll();
			list.forEach(e->System.out.println(e));
			
//			List<String> strList=servicedao.validateFetchAllBrandName();
//			strList.forEach(e->System.out.println(e));
			
//			List<String> list=servicedao.validateFetchAllBrandNameByQuantity(50);
//			list.forEach(e->System.out.println(e));
			
//			List<Object[]> list=servicedao.validateFetchAllBrandNameAndPrice();
//			for(Object[] obj:list)
//			{
//				System.out.println(obj);
//				System.out.println("Brand name is :"+obj[0]+" and "+"it's price is "+obj[1]);
//			}
			
//			List<Object[]> list=servicedao.validateFetchAllBrandNameAndCountByQuantity(50);
//			System.out.println(list);
//			for(Object[] obj:list)
//			{
//				System.out.println("Brand Name is "+obj[0]+" count ="+obj[1]);
//			}
			
//			List<Object> list=servicedao.validateFetchAllBrandNameCountByPrice(25.0);
//			System.out.println(list);
//			for(Object obj:list)
//			{
//				System.out.println("Brand Number :"+obj);
//			}
			
			System.out.println("End of main method");

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Something went wrong in getting values in main method");
		} finally {
			SFSingleton.closeSF();
		}

	}

}
