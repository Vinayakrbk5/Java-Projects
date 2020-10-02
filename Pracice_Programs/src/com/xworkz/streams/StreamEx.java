package com.xworkz.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {
	public static void display(int i) {
		System.out.println(i*3);
	}
	
	public static int add(int i)
	{
		return i+10;
	}

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
//		list.forEach(p->System.out.println(p));
		
//		list.forEach(StreamEx::display);
		list.forEach(p->StreamEx.display(p));
		System.out.println("------------------");
//		list.forEach(p->StreamEx.add(p)).collect(Collectors.toList());
		List<Integer> list2=list.stream().map(p->p+10).collect(Collectors.toCollection(()->new ArrayList<>()));
		list2.forEach(p->System.out.println(p));
		
//		int res=list.stream().map(p->p*2).reduce(0,(p,e)->p+e);
//		int res=list.stream().reduce(0, (c,e)->Integer.sum(c, e));
		int res=list.stream().reduce(0, Integer::sum);
		
		System.out.println("Total is :"+res);
//		list.forEach(System.out::println);
		
		
	} 

}
