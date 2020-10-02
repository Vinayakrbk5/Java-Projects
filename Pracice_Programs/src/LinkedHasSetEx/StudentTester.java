package LinkedHasSetEx;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class StudentTester {
	public static void main(String[] args) {
		LinkedHashSet<Student> Lhlist=new LinkedHashSet<>();
		Lhlist.add(new Student("Vinayak",2));
		Lhlist.add(new Student("Bharath",6));
		Lhlist.add(new Student("Savithri",3));
		Lhlist.add(new Student("Chinmaye",7));
		Lhlist.add(new Student("Nikhil",4));
		System.out.println("Linkedhasset elements are :"+Lhlist);
		System.out.println();
		LinkedList<Student> llist=new LinkedList<>(Lhlist);
		
		System.out.println("_ _ _Using Comparable Implements_ _ _");
		Collections.sort(llist);
		System.out.println("Sorted in ascending order by using Comparable implements :"+llist);
		
		Collections.sort(llist,Collections.reverseOrder());
		System.out.println("Sorted in descending order by name :"+llist);
		System.out.println();
		
		System.out.println("_ _ _Using Comparator Implements_ _ _");
		Collections.sort(llist, new SortByName());
		
		System.out.println("Sorted in ascending order by using Comparator implements :"+llist);
		Collections.sort(llist, Collections.reverseOrder());
		System.out.println("Sorted in descending order by name  :"+llist);
	}

}
