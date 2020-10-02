package HashMapEx;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap<Integer,String> cmap=new HashMap();
		cmap.put(560098,"R R Nagar");
		
		cmap.put(560001, "Majestic");
		cmap.put(560023, "Grinagar");
		System.out.println(cmap);
		
		Set<Integer> keyset=cmap.keySet();
		for(Integer i:keyset)
		{
			System.out.println(i);
		}
		for(Integer k:keyset)
		{
			System.out.println("K :"+k+" value :"+cmap.get(k));
		}
		
		Collection<String> valu=cmap.values();
		for(String s:valu)
		{
			System.out.println(s);
		}
		cmap.put(null, null);
		cmap.put(null, "BHEL");
		cmap.put(560098, "BEML");
		System.out.println(cmap);
		
	}

}
