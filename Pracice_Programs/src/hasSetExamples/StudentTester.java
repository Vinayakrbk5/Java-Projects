package hasSetExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class StudentTester {
	public static void main(String[] args) {
		HashSet<Student> hset=new HashSet<>();
		hset.add(new Student("Vinayak",2));
		hset.add(new Student("Bharath",4));
		hset.add(new Student("Savithri",3));
		hset.add(new Student("Chinmaye",7));
		hset.add(new Student("Nikhil",5));
		System.out.println("Hasset elements are : "+hset);
		
		ArrayList<Student> arrlist=new ArrayList<>(hset);
//		LinkedList<Student> linklist=new LinkedList<>(hset);  // this is also possible
//		Collections.sort(arrlist);
//		System.out.println("Sorted using Comparable :"+arrlist);
//		Collections.sort(arrlist,Collections.reverseOrder());
//		System.out.println("In Reverse order by Comaparable :"+arrlist);
		System.out.println();
		
//		Collections.sort(arrlist, new SortByName());
//		System.out.println("Sorting By Comaparator :"+arrlist);
		
		Collections.sort(arrlist,Collections.reverseOrder());
		System.out.println("In Reverse order by Comparator :"+arrlist);
		
		
	}

}
