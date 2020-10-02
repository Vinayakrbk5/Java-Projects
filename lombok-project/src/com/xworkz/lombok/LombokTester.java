package com.xworkz.lombok;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LombokTester {

	public static void main(String[] args) {
//		LombokEx obj=new LombokEx();
//		System.out.println(obj);
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(1, 25);
//		list.remo
		System.out.println(list.contains(11));
		System.out.println("List is "+list);
		Collections.sort(list);
		System.out.println("After sort : "+list);
//		list.remove(1);
//		System.out.println("List is "+list);
	}
}
