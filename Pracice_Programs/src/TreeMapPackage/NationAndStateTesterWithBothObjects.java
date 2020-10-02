package TreeMapPackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class NationAndStateTesterWithBothObjects {
	public static void main(String[] args) {
		TreeMap<Nation,State> omap=new TreeMap<>(new Comparator<Nation>() {

			@Override
			public int compare(Nation n1, Nation n2) {
				return n1.getNationcap().compareTo(n2.getNationcap());
			}
			
		});
		omap.put(new Nation("Delhi",29), new State("Bangalore",30));
		omap.put(new Nation("Newyork",10), new State("Newyork",15));
		omap.put(new Nation("Delhi",20), new State("Bangalore",30));
//		System.out.println(omap);
		Iterator<Entry<Nation,State>> itr=omap.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		}

}
