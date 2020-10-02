package ComparableExapmles;

import java.util.ArrayList;
import java.util.Collections;

public class NumberTester {
	public static void main(String[] args) {
		ArrayList<Integer> intarray=new ArrayList();
		intarray.add(50);
		intarray.add(20);
		intarray.add(10);
		intarray.add(45);
		intarray.add(25);
		System.out.println("array elements before sorting :"+intarray);
		Collections.sort(intarray);
		System.out.println("array elements after sorting :"+intarray);
		
		ArrayList<Television> Tobj1=new ArrayList();
		Tobj1.add(new Television("Nokia",80,"Black"));
		Tobj1.add(new Television("LG",25,"blackandWhite"));
		Tobj1.add(new Television("Sony",54,"White"));
		System.out.println("Before Sorting");
		for(Television i:Tobj1) {
		System.out.println(i);
		}
		Collections.sort(Tobj1);
		System.out.println();
		System.out.println("After sorting ");
		for(Television i:Tobj1) {
			System.out.println(i);
			}
		
		}
}
