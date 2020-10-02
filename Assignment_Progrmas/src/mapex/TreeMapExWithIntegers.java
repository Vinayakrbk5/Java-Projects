package mapex;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExWithIntegers {
	public static void main(String[] args) {
		TreeMap<Integer, Character> tmap=new TreeMap<>();
		TreeMap<Integer, Character> tmap1=new TreeMap<>();
		tmap.put(2, 'V');
		tmap.put(5, 'B');
		tmap.put(1, 'S');
		tmap.put(8, 'K');
		System.out.println(tmap);
		tmap1.putAll(tmap);
		Set<Integer> kset=tmap.keySet();
		for(int k:kset)
		{
			System.out.println("Key is :"+k);
		}
		Collection<Character> vset=tmap.values();
		for(Character c:vset)
		{
			System.out.println("Value is :"+c);
		}
		Iterator<Entry<Integer,Character>> itr=tmap.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println("Key and Value pair are :"+itr.next());
		}
		System.out.println("Ceiling entry(Key value pair):"+tmap.ceilingEntry(5)); // it shows next higher key value pair
		System.out.println("Ceiling Key(Only key value) :"+tmap.ceilingKey(3));    // it shows only next higher key 
		
		System.out.println("Keys in descending order:"+tmap.descendingKeySet()); // it shows only keys in descending order
		System.out.println("Key Value pair in descending order:"+tmap.descendingMap()); // it shows both key value pair in descending order
		
		System.out.println("First key value pair:"+tmap.firstEntry());  // it shows first entry that is first key value pair
		System.out.println("First key(Only key value) :"+tmap.firstKey()); // it shows first key
		
		System.out.println("Floor entry(Key value pair):"+tmap.floorEntry(4)); // it shows next lower key value pair
		System.out.println("Floor key:"+tmap.floorKey(4)); //it shows only next lower key
		
		System.out.println("Head Map:"+tmap.headMap(5)); // it inclusive of first and exclusive of last
		System.out.println("Tail Map:"+tmap.tailMap(5));// here first and last are both inclusive
		System.out.println("Sub Map:"+tmap.subMap(1, 8)); // first is inclusive and last is exclusive
		
		System.out.println("Higher value(Key value pair):"+tmap.higherEntry(5)); //  shows higher key value pair to given value
		System.out.println("Higher key(Only key):"+tmap.higherKey(4));           // shows only higher kay
		
		System.out.println("Lower Entry(Key value pair):"+tmap.lowerEntry(5));   // shows lower key value pair to given value
		System.out.println("Lower key(Only Key):"+tmap.lowerKey(6));   // shows only lower key
		
		System.out.println("Last Entry(Key value pair):"+tmap.lastEntry()); //last key value pair
		System.out.println("Last key(Only key):"+tmap.lastKey());  // last key only
		
		System.out.println("Removes first entry:"+tmap.pollFirstEntry());  // removes first entry
		System.out.println(tmap);
		
		System.out.println("Removes Last entry:"+tmap.pollLastEntry());  // removes last entry
		System.out.println(tmap);
		
		System.out.println("Removes key=5:"+tmap.remove(5)); // removes key value pair of key 5
		System.out.println(tmap);
		
		tmap.putAll(tmap1);
		System.out.println(tmap.computeIfAbsent(1,k-> 'C'));
		System.out.println(tmap.computeIfPresent(5, (key,val)->'P'));
//		wordCount.computeIfPresent("for", 
//                (key, val) -> val + 1); 
		System.out.println(tmap);
		
	}

}
