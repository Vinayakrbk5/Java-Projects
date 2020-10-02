package LinkedHasSetEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHasSetInsideLinkedHasSet {
	public static void main(String[] args) {
		LinkedHashSet<LinkedHashSet> LHasSet=new LinkedHashSet<>();
		LinkedHashSet<Integer> Iset=new LinkedHashSet<>();
		LinkedHashSet<String> Sset=new LinkedHashSet<>();
		LinkedHashSet<Integer> Iset2=new LinkedHashSet<>();
		
		Iset.add(20);
		Iset.add(10);
		Iset.add(50);
		Iset.add(25);
		Iset.add(15);
		System.out.println("Integer List :"+Iset);
		
		Sset.add("Vinayak");
		Sset.add("Sharath");
		Sset.add("Chinmaye");
		Sset.add("Basavaraj");
		System.out.println("Names Set :"+Sset);
		
		Iset2.add(200);
		Iset2.add(50);
		Iset2.add(500);
		Iset2.add(300);
		System.out.println("Integer set is :"+Iset2);
		
		
		LHasSet.add(Iset);
		LHasSet.add(Iset2);
		LHasSet.add(Sset);
		System.out.println("Set of Sets :"+LHasSet);
		
		System.out.println("_ _ _Printing elements using foreach loop_ _ _");
		for(LinkedHashSet i:LHasSet)
		{
			System.out.println(i);
		}
		System.out.println("Sorted using arraylist");
		for(LinkedHashSet i:LHasSet)
		{
			ArrayList arrlist=new ArrayList<>(i);
			Collections.sort(arrlist);
			System.out.println(arrlist);
		}
	}

}
