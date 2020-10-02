package LinkedHashMapPackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class WatchTester {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Watch> linkwatch=new LinkedHashMap<>();
		linkwatch.put(2, new Watch(true,"Sonata Software","Black"));
		linkwatch.put(4, new Watch(false,"Blackberry","Brown"));
		linkwatch.put(6, new Watch(true,"Google","White"));
		System.out.println(linkwatch);
		
		Iterator<Entry<Integer,Watch>> itr=linkwatch.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<Integer,Watch> obj=itr.next();
			System.out.println(obj);
			
		}
	}

}
