package LinkedHashMapPackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class NationAndStateTesterWithBothObject {
	public static void main(String[] args) {
		LinkedHashMap<Nation,State> lset=new LinkedHashMap<>();
		lset.put(new Nation("Delhi",28), new State("Bangalore",30));
		lset.put(new Nation("Newyork",29), new State("Newyork",20));
		lset.put(new Nation("Londan",10), new State("London",5));
		System.out.println(lset);
		
		Iterator<Entry<Nation,State>> itr=lset.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println("Values are :"+itr.next());
		}
		
	}

}
