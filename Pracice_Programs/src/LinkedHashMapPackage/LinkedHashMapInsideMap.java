package LinkedHashMapPackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapInsideMap {
	public static void main(String[] args) {
		LinkedHashMap<String,ArrayList<String>> lmap=new LinkedHashMap<>();
		ArrayList<String> states=new ArrayList<>();
		ArrayList<String> dist=new ArrayList<>();
		ArrayList<String> tal=new ArrayList<>();
		
		states.add("Karnataka");
		states.add("MP");
		states.add("Rajasthan");
		
		dist.add("Bagalkot");
		dist.add("Vijaypur");
		
		tal.add("Jamakhandi");
		tal.add("Mudhol");
		tal.add("Gokak");
		tal.add("Raibag");
		
		lmap.put("Vinayak", states);
		lmap.put("Sachin", dist);
		lmap.put("Rathod", tal);
		
		for(Map.Entry<String,ArrayList<String>> map1:lmap.entrySet())
//		for(<String, ArrayList<String>> s:map1.getValue())
		{
			String keyset=map1.getKey();
			System.out.println(keyset+" : ");
				for(int i=0;i<map1.getValue().size();i++){
				{
					System.out.println("\t"+map1.getValue().get(i));
				}
			}
		}
	}
}
