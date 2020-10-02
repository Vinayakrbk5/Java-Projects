package TreeSetEx;

import java.util.TreeSet;

public class SimpleTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> Tset=new TreeSet<>();
		Tset.add(39);
		Tset.add(25);
		Tset.add(10);
		Tset.add(30);
		System.out.println("Tree Set is :"+Tset);
//		Tset.clear();
//		Tset.remove(10);
		System.out.println(Tset);
		System.out.println(Tset.first());
//		Tset.clear();
		System.out.println("PollFirst :"+Tset.pollFirst()); // it removes the first element
		System.out.println("After removing :"+Tset);
		System.out.println(Tset.last());
		Tset.add(10);
		System.out.println("Floor of 24 :"+Tset.floor(24)); // next lower number
		System.out.println("Floor of 25 :"+Tset.floor(25));
		
		System.out.println("Ceiling of 35:"+Tset.ceiling(35)); // next higher number
		System.out.println("Ceiling of 30 :"+Tset.ceiling(30));
		
		System.out.println("List of lower numbers :"+Tset.headSet(25));  // list of next lower numbers
//																			exclusive of present number
		System.out.println("List of higher number :"+Tset.tailSet(25));  // list of next higher numbers 
//																			inclusive of present number
		
		System.out.println("Next Higher :"+Tset.higher(24));  // prints next higher
		System.out.println("Next Lower :"+Tset.lower(26));    // prints next lower
		
		System.out.println(Tset.pollFirst());
		System.out.println("After removing first element :"+Tset);
		
		System.out.println(Tset.pollLast());
		System.out.println("After removing last element :"+Tset);
		
		
		System.out.println(Tset.descendingSet());
		System.out.println(Tset);
		Tset.add(10);
		Tset.add(20);
		Tset.add(40);
		System.out.println(Tset);
		
		System.out.println(Tset.subSet(10, 35));
		System.out.print("Key Values are :");
		Tset.forEach(k->System.out.print(k+" "));
	}

}
