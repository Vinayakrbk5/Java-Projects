package IteratorExapmles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayOfArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList> arrlist=new ArrayList<>();
		ArrayList<Integer> arr1=new ArrayList<>();
		ArrayList<String> arr2=new ArrayList<>();
		ArrayList<Character> arr3=new ArrayList<>();
		arr1.add(25);
		arr1.add(20);
		arr1.add(30);
		arr1.add(15);
		System.out.println(arr1);
		
		arr2.add("Vishal");
		arr2.add("Vinayak");
		arr2.add("Basavaraj");
		System.out.println(arr2);
		
		arr3.add('S');
		arr3.add('V');
		arr3.add('B');
		arr3.add('R');
		arr3.add('H');
		System.out.println(arr3);
		
		arrlist.add(arr1);
		arrlist.add(arr2);
		arrlist.add(arr3);
		System.out.println(arrlist);
		System.out.println("Using Iterator");
		ListIterator<ArrayList> itr=arrlist.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println("one");
			System.out.println(itr.next());
			System.out.println("two");
//			System.out.println(itr.next());
//			System.out.println(itr.nextIndex());
		}
		
		
	}

}
