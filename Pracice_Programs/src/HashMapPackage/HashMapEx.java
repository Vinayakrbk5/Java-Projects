package HashMapPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

// methods are: put(),get(),remove(),clear(),isempty(),putall(),replace(),keyset(),values(),entryset(),contains()
public class HashMapEx {
	public static void main(String[] args) {
		HashMap<Integer,String> intmap=new HashMap<>();
		HashMap<Integer,String> new_intmap=new HashMap<>();
		new_intmap.put(0, "Vinayak");
		intmap.put(24, "Vinayak");
		intmap.put(87, "Vishal");
		intmap.put(52, "Arun");
		intmap.put(48, "Basavaraj");
		System.out.println(intmap);
		
		intmap.put(18, "Chinmaye");
		System.out.println(intmap);
		
		intmap.put(25,"Savithri");
		System.out.println(intmap);
		
		intmap.put(65,"Nikhil");
		System.out.println(intmap);
		
		intmap.put(null, null);
		System.out.println(intmap);
		
		intmap.put(24, "Rabkavi");
		System.out.println(intmap);
		
		intmap.put(20, "Rabkavi");
		System.out.println(intmap);
		
		Set<Integer> keyset=intmap.keySet(); // we can import Collection instead of set,then it becomes generic,
											 //	but we use set because we need unique set of values since set holds only unique values 
		
		for(Integer i:keyset)
		{
			System.out.println("Values of key are :"+i);
		}
		
		Collection<String> val=intmap.values();
		
		for(String s:val)
		{
			System.out.println("Values are :"+s);
		}
		
//		intmap.clear();   // removes all the values
//		System.out.println(intmap);
		System.out.println(intmap.containsKey(26)); // gives true if given key is there or else false
		
		Iterator<Entry<Integer, String>> eset=intmap.entrySet().iterator();
		while(eset.hasNext()) {
			System.out.println("Key and value is :"+eset.next());
		}
		
		System.out.println(intmap.isEmpty());
		
		new_intmap.putAll(intmap);  // here values of intmap object are copied to new_intmap object 
		System.out.println(new_intmap);
		System.out.println(intmap);
		intmap.remove(18, "Chinmaye"); // it removes one element 
		System.out.println(intmap);
		
		intmap.replace(48, "Nikhil");
		System.out.println(intmap);
	}
}
