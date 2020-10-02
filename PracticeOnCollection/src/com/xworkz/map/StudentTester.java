package com.xworkz.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StudentTester {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap=new HashMap<>();
		
		hashMap.put(6, "Vinayak");
		hashMap.put(2, "Kanchan");
		hashMap.put(4, "Nikhil");
		hashMap.put(5, "chinmaye");
		hashMap.put(1, "Jugan");
		
	for(Map.Entry<Integer, String> obj:hashMap.entrySet())
	{
		System.out.println(obj);
	}
	
	Set<Integer> keyset=hashMap.keySet();
//	keyset.forEach(p->System.out.println(p));
	
	Collection<String> valueSet=hashMap.values();
//	valueSet.forEach(p->System.out.println(p));
	
	Iterator<Entry<Integer, String>> entrySet=hashMap.entrySet().iterator();
//	while(entrySet.hasNext())
//	{
//		System.out.println(entrySet.next());
//	}
	
	
	LinkedHashMap<Integer,ArrayList<String>> linkMap=new LinkedHashMap<>();
	ArrayList<String> arrList=new ArrayList<>();
	arrList.add("Karntaka");
	arrList.add("Maharastra");
	
	ArrayList<String> arrList1=new ArrayList<>();
	arrList1.add("Bangalore");
	arrList1.add("Mysore");
	
	linkMap.put(3, arrList);
	linkMap.put(1, arrList1);
	
//	Iterator<Entry<Integer, ArrayList<String>>> itr=linkMap.entrySet().iterator();
	Set<Integer> keySet1=linkMap.keySet();
	Collection<ArrayList<String>> valueSet1=linkMap.values();
	keySet1.forEach(p->System.out.println(p));
	
	for(Map.Entry<Integer, ArrayList<String>> obj:linkMap.entrySet())
	{
		System.out.println(obj.getKey());
		for(String obj2:obj.getValue())
		{
			System.out.println("\t"+obj2);
		}
	}
	
	
	
	
		
	}

}
