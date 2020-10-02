package LinkedHashMapPackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHasMapEx {
	public static void main(String[] args) {
		LinkedHashMap<Integer ,String> lset=new LinkedHashMap<>();
		lset.put(20, "Vinayak");
		lset.put(15, "Vishal");
		lset.put(25, "Nikhil");
		lset.put(30, "Savithri");
//		System.out.println(lset);
		lset.putIfAbsent(20, "Chinmaye");
//		System.out.println(lset);
		Set<Entry<Integer,String>> entry=lset.entrySet();
		System.out.println(entry);
//		for(Map.Entry<Integer,String> i:entry)
//		{
//			System.out.println(i.getKey()+" and "+i.getValue());
//		}
	}

}
