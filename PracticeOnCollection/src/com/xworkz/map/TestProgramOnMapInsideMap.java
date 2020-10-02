package com.xworkz.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestProgramOnMapInsideMap {

	public static void main(String[] args) {
		HashMap<String, HashMap<String, ArrayList<String>>> hashMap1=new HashMap<>();
		ArrayList<String> karCities=new ArrayList<>();
		ArrayList<String> mhCities=new ArrayList<>();
		
		ArrayList<String> acities=new ArrayList<>();
		ArrayList<String> bcities=new ArrayList<>();
		
		acities.add("Corona");
		bcities.add("Gonda");
		
		karCities.add("Bangalore");
		karCities.add("Hubli");
		mhCities.add("Mumbai");
		mhCities.add("Pune");
		
		
		
		HashMap<String , ArrayList<String>> hashMap2=new HashMap<>();
		hashMap2.put("Karnataka", karCities);
		hashMap2.put("Maharastra", mhCities);
		
		HashMap<String , ArrayList<String>> hashMap3=new HashMap<>();
		hashMap3.put("California", acities);
		hashMap3.put("Newyork", bcities);
		
		hashMap1.put("India", hashMap2);
		hashMap1.put("USA", hashMap3);
		for(Map.Entry<String, HashMap<String, ArrayList<String>>> obj:hashMap1.entrySet())
		{
			System.out.println(obj.getKey());
			for(Map.Entry<String , ArrayList<String>> obj2:obj.getValue().entrySet())
			{
				System.out.println("\t"+obj2.getKey());
				for(String obj3:obj2.getValue())
				{
					System.out.println("\t\t"+obj3);
				}
			}
		}
		
		
	}

}
