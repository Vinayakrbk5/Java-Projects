package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTester {

	public static void main(String[] args) {
		ArrayList<Student> arrlist=new ArrayList();
		arrlist.add(new Student("Vinayak",6,"Bangalore"));
		arrlist.add(new Student("Vishal",2,"Bagalkot"));
		arrlist.add(new Student("Vinayak",3,"Udupi"));
		arrlist.add(new Student("Basavaraj",4,"Vijayapura"));
			
		System.out.println(arrlist);
		Collections.sort( arrlist);
		System.out.println("After Sorting by names");
		for(Student i:arrlist)
		{
			System.out.println(i);
		}
	}
}
