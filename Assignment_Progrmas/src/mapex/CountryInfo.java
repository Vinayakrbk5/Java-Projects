package mapex;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountryInfo {

	public static void main(String[] args) {
		LinkedHashMap<String,LinkedHashMap<String,ArrayList<String>>> worldmap=new LinkedHashMap<String,LinkedHashMap<String,ArrayList<String>>>();
		LinkedHashMap<String,ArrayList<String>> indianstates=new LinkedHashMap<String,ArrayList<String>>();
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
		
		LinkedHashMap<String,ArrayList<String>> usstates=new LinkedHashMap<String,ArrayList<String>>();
		ArrayList<String> alaskacities=new ArrayList<>();
		
		
		alaskacities.add("Washington");
		alaskacities.add("Newyork");
		alaskacities.add("California");
		
		usstates.put("Alaska", alaskacities);
		
		worldmap.put("USA", usstates);
		
		for(Map.Entry<String,LinkedHashMap<String,ArrayList<String>>> wmap:worldmap.entrySet())
		{
			String wkey=wmap.getKey();
			LinkedHashMap<String,ArrayList<String>> wval=wmap.getValue();
			System.out.println(wkey + ": ");
			for(Map.Entry<String,ArrayList<String>> conmap:wval.entrySet())
			{
				String conkey=conmap.getKey();
				ArrayList<String> convalue=conmap.getValue();
				System.out.println("\t"+conkey+":");
				for(String states:convalue)
				{
					System.out.println("\t\t" +states);
				}
			}
		}
		
		
	}
}