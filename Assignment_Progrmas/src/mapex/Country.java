package mapex;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class Country {

	public static void main(String[] args) {
		HashMap<String,HashMap<String,ArrayList<String>>> worldmap=new HashMap<String,HashMap<String,ArrayList<String>>>();
		HashMap<String,ArrayList<String>> indianstates=new HashMap<String,ArrayList<String>>();
		ArrayList<String> karcities=new ArrayList<String>();
		
		karcities.add("Bangalore");
		karcities.add("Mysore");
		karcities.add("Hubli");
		
		ArrayList<String> mhrcities=new ArrayList<String>();
		
		mhrcities.add("Nagpur");
		mhrcities.add("Solapur");
		mhrcities.add("Sangli");
		
		indianstates.put("Karnataka", karcities);
		indianstates.put("Maharastra", mhrcities);
		
		worldmap.put("India", indianstates);
		
		HashMap<String,ArrayList<String>> usstates=new HashMap<String,ArrayList<String>>();
		ArrayList<String> alaskacities=new ArrayList<>();
		
		
		alaskacities.add("Washington");
		alaskacities.add("Newyork");
		alaskacities.add("California");
		
		usstates.put("Alaska", alaskacities);
		
		worldmap.put("USA", usstates);
		
//		Collection<Entry<String,HashMap<String,ArrayList<String>>>> entry= worldmap.entrySet();
//		System.out.println("Info is :");
//		System.out.println(entry);
		
		for(Map.Entry<String,HashMap<String,ArrayList<String>>> wmap:worldmap.entrySet())
		{
			String wkey=wmap.getKey();
			HashMap<String,ArrayList<String>> wval=wmap.getValue();
			System.out.println(wkey + ": ");
//		Collection<Entry<String, ArrayList<String>>> entry1=wval.entrySet();
			
//			System.out.println("city info :");
//			System.out.println(entry1);
			
			for(Map.Entry<String,ArrayList<String>> conmap:wval.entrySet())
			{
				String conkey=conmap.getKey();
//				ArrayList<String> convalue=conmap.getValue();
				System.out.println("\t"+conkey+":");
				for(String states:conmap.getValue())
				{
					System.out.println("\t\t" +states);
				}
			}
		}
		
		
	}
}