package TreeMapPackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, Character> tmap = new TreeMap<>();
		tmap.put(2, 'V');
		tmap.put(5, 'B');
		tmap.put(1, 'S');
		tmap.put(8, 'K');
		System.out.println(tmap);

		Set<Integer> kset = tmap.keySet();
		System.out.println("printing keys using foreach");
		for (Integer i : kset) {
			System.out.println(i);
		}
		System.out.println("printing keys using foreach and lamda function");
		kset.forEach(i -> { System.out.print(i + " ");}
		             );
		System.out.println();
		System.out.println("----------------------");

		Collection<Character> val = tmap.values();
		System.out.println("printing values using foreach");
		for (Character i : val) {
			System.out.println(i);
		}
		System.out.println("printing values using foreach and lamda function");
		val.forEach(va -> System.out.print(va + " "));

		System.out.println();
		System.out.println("----------------------");

		Iterator<Entry<Integer, Character>> itr = tmap.entrySet().iterator();
		System.out.println("printing  key-value pair using Iterator");
		while(itr.hasNext())
			{
			System.out.println(itr.next()+"  ");;
		}
		System.out.println("printing  key-value pair using foreach and lamda function");
		tmap.keySet().iterator().forEachRemaining(key->System.out.println("Key:"+key+" and "+"Value:"+tmap.get(key)));
}
}