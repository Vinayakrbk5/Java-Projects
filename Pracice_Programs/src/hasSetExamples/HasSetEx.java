package hasSetExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HasSetEx {
	public static void main(String[] args) {
		HashSet<Integer> Hset=new HashSet<>();
		HashSet<String> Sset=new HashSet<>();
//		LinkedHashSet<Integer> Hset=new LinkedHashSet<>(Iset);
		Hset.add(30);
		Hset.add(25);
		Hset.add(10);
		Hset.add(15);
		System.out.println("Array is:"+Hset);
		Hset.add(25);  // duplicates are not allowed means 
//		                  they are not printed twice they are printed once
		System.out.println(Hset);
		Sset.add("Vinayak");
		Sset.add("Savithri");
		Sset.add("Bharath");
		Sset.add("Chinmaye");
		Sset.add("Nikhil");
		System.out.println("String array is :"+Sset);
//		Hset.add(null);
		ArrayList<Integer> aList=new ArrayList<>(Hset);
		Collections.sort(aList);
		System.out.println("Sorted Using ArrayList:"+aList);
		ArrayList<String> Sarr=new ArrayList<>(Sset);
		Collections.sort(Sarr);
		System.out.println("After Sorting:"+Sarr);
		
		Collections.sort(aList,Collections.reverseOrder());
		System.out.println("In revrse order :"+aList);
		
		Collections.sort(Sarr,Collections.reverseOrder());
		System.out.println("In reverse order :"+Sarr);
		
//		Operations on HasSet()
		Hset.remove(25);
		System.out.println("After removing :"+Hset);
		Sset.remove("Savithri");
		System.out.println("After removing :"+Sset);
		
		System.out.println(Hset.contains(10));
		
	}
}
