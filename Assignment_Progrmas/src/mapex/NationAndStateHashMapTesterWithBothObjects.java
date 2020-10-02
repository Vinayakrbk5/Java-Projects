package mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class NationAndStateHashMapTesterWithBothObjects {

	public static void main(String[] args) {
		HashMap<NationHashMap,StateHashMap> setmap=new HashMap<>();
		setmap.put(new NationHashMap(28,"Delhi"), new StateHashMap(30,"Bangalore"));
		setmap.put(new NationHashMap(20,"Newyork"), new StateHashMap(19,"Newyork"));
//		System.out.println(setmap);
		setmap.put(new NationHashMap(28,"Bangalore"), new StateHashMap(30,"Bangalore"));
//		System.out.println(setmap);
		Iterator<Entry<NationHashMap,StateHashMap>> eset=setmap.entrySet().iterator();
		while(eset.hasNext())
		{
			System.out.println(eset.next());
		}
	}
}
