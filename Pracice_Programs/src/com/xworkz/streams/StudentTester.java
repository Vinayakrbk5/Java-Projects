package com.xworkz.streams;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentTester {

	public static void main(String[] args) {
		ArrayList<Student> studList=new ArrayList<>();
		studList.add(new Student(1, "Vinayak", 25, new Department(11, "ECE")));
		studList.add(new Student(3, "Vishal", 23,new Department(33, "CSE")));
		studList.add(new Student(2, "Nikhil", 21,new Department(22, "ISE")));
		studList.add(new Student(5, "Chinmaye", 25,new Department(55, "EEE")));
		
//		Map<K, V>
		
		ArrayList<Student> studList2=new ArrayList<>();
		
//		studList.forEach(p->System.out.println(p));
//		studList.forEach(System.out::println);
		
//		for(Student stud:studList)
//		{
//			if(stud.getAge()>22)
//			{
//				int age=stud.getAge()*2;
//				studList2.add(new Student(stud.getStId(), stud.getName(), age));
//			}
//		} 
		System.out.println("Array elements are :");
		studList.forEach(p->System.out.println(p));
		
//		Set<Integer> list=studList.stream().filter(p->p.getAge()>22).map(p->p.getAge()).collect(Collectors.toSet());
//		list.forEach(p->System.out.println(p));
		
//		List<Integer> list2=studList.stream().map(Student::getAge).collect(Collectors.toCollection(()->new ArrayList<Integer>()));
		
//		System.out.println("Set elements are :");
//		list2.forEach(p->System.out.println(p));
		
		Integer total=studList.stream().collect(Collectors.summingInt(Student::getAge));
//		System.out.println(total);
		
		IntSummaryStatistics summary=studList.stream().collect(Collectors.summarizingInt(Student::getAge));
//		System.out.println(summary);
		
		Double avg=studList.stream().collect(Collectors.averagingInt(Student::getAge));
		System.out.println(avg);
		
		Long count=studList.stream().collect(Collectors.counting());
		System.out.println(count);
		
		LinkedList count1=studList.stream().collect(Collectors.toCollection(()->new LinkedList()));
		
//		Map<Department, List<Student>> arrList=studList.stream().collect(Collectors.groupingBy(Student::getDepartment));
//		System.out.println("Map exa");
//		for(Map.Entry<Department,List<Student>> obj:arrList.entrySet())
//		{
//			System.out.println(obj);
//		}
	}

}
