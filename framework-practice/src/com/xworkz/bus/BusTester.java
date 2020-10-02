package com.xworkz.bus;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.singleton.SFSingleton;

public class BusTester {

	
	public static void main(String[] args) {
		try {
		System.out.println("Start : Main method");
		BusDTO bdto=new BusDTO();
		bdto.setBusCapacity(50);
		bdto.setBusColor("green");
		bdto.setBusName("BMTC");
		
		BusDAO bdao=new BusDAOImpl();
//		bdao.create(bdto);
		
//		BusDTO bdto1= bdao.fetchByname("KSRTC");
//		System.out.println(bdto1.getBusId());
//		bdao.deleteByCapacityAndId(50, 2);
//		bdao.updateIdByName(100, "MHRTC");
//		Long count=bdao.fetchCount();
//		System.out.println("Total number of rows in table is "+count);
		
//		Long totalCount=bdao.fetchByBusName();
//		System.out.println("Number of rows counted by busName is "+totalCount);
		
//		Integer maxCapacity=bdao.fetchMaxByCapacity();
//		System.out.println("Maximum number of seats is "+maxCapacity);
		
//		Long totalSum=bdao.fetchSumByCapacity();
//		System.out.println("Total number of seats of all busses is "+totalSum);
		
//		Integer secMax=bdao.fetchSecondMaxByCapacity();
//		System.out.println("Second maximum capacity is "+secMax);
		
//		ArrayList<BusDTO> bdto1=(ArrayList<BusDTO>) bdao.fetchBusNameAndCapacityById(2);
//		System.out.println(bdto1);
//		System.out.println("Bus Name is "+((BusDTO) bdto1).getBusName());
//		System.out.println("Bus capacity is "+((BusDTO) bdto1).getBusCapacity());
//		System.out.println("End :  method");
		
//		ArrayList arrList= (ArrayList) bdao.fetchBusNameAndCapacityById(2);
//		System.out.println( "Bus Name is "+arrList.get(0));
//		System.out.println("Bus capacity is "+arrList.get(1));
//		for(Object bus:objects)
//		{
//			String busName=(String)bus[0];
//		}
		
		List<Object[]> list=bdao.fetchBusNameAndCountByCapacity(60);
		for(Object[] obj:list)
		{
			System.out.println(obj[0]+", "+obj[1]);
			
		}
//		System.out.println(list);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		SFSingleton.closeSF();
		}
		
	}
}
