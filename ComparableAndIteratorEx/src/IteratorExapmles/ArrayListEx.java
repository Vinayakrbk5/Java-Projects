package IteratorExapmles;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
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
		for(char i:arr3)
		{
			System.out.println("arr3 elements are: "+i);
		}
		
		arrlist.add(arr1);
		arrlist.add(arr2);
		arrlist.add(arr3);
		System.out.println(arrlist);
		Iterator<ArrayList> itr=arrlist.iterator();
		while(itr.hasNext())
		{
			ArrayList m=itr.next();
			for(int i:m)
			{
				System.out.println(i);
			}
		}
	}

}
