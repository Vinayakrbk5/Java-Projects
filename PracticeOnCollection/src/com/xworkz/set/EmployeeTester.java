package com.xworkz.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import com.xworkz.list.Student;

public class EmployeeTester {

	public static void main(String[] args) {
		
//		Comparator<Employee> comp=new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee stud1, Employee stud2) {
//				return stud1.getName().compareTo(stud2.getName());
//			}
//		};
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("Karan");
		hashSet.add("Vinay");
		hashSet.add("Jugan");
		hashSet.add("Nikhil");
		hashSet.add("Chinmaye");
		hashSet.add("Kavya");
		
		System.out.println("before Sorting");
		hashSet.forEach(p->System.out.println(p));
		
		ArrayList<String> arrList=new ArrayList<>(hashSet);
		Collections.sort(arrList);
		
		System.out.println("After sorting");
		arrList.forEach(p->System.out.println(p));
		
		
		
		LinkedHashSet<Employee> linkSet=new LinkedHashSet<>();
		linkSet.add(new Employee(1, "Karan", "Mysore"));
		linkSet.add(new Employee(6, "Vinayak", "Bagalkot"));
		linkSet.add(new Employee(3, "Chinmaye", "Hibli"));
		
		linkSet.forEach(p->System.out.println(p));
		
		ArrayList<Employee> arrList1=new ArrayList<>(linkSet);
		
		TreeSet<Employee> tSet=new TreeSet<>(linkSet);
		System.out.println("tree set sort");
		tSet.forEach(p->System.out.println(p));
		
//		Collections.sort(arrList1);
//		
//		arrList1.forEach(p->System.out.println(p));
//		
		
	}
}
