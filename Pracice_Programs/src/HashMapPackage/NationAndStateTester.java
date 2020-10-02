package HashMapPackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class NationAndStateTester {
	public static void main(String[] args) {
		HashMap<Nation,State> setmap=new HashMap<>();
		setmap.put(new Nation(28,"Delhi"), new State(30,"Bangalore"));
		setmap.put(new Nation(20,"Newyork"), new State(19,"Newyork"));
//		System.out.println(setmap);
		setmap.put(new Nation(28,"Bangalore"), new State(30,"Bangalore"));
//		System.out.println(setmap);
		Iterator<Entry<Nation,State>> eset=setmap.entrySet().iterator();
		while(eset.hasNext())
		{
			System.out.println(eset.next());
		}
	}

}
