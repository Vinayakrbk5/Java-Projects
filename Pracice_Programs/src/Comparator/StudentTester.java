package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTester  {
	public static void main(String[] args) {
	
	ArrayList<Student> arrlist=new ArrayList();
	arrlist.add(new Student("Vinayak",6,"MysoreS"));
	arrlist.add(new Student("Vishal",2,"Bagalkot"));
	arrlist.add(new Student("Sharath",3,"Udupi"));
	arrlist.add(new Student("Basavaraj",4,"Hubli"));
		System.out.println("The Elements are: ");
	for(Student s:arrlist)
	{
		System.out.println(s);
	}

	Collections.sort(arrlist, new SortByName());
	System.out.println();
	System.out.println("After sorting by name");
	for(Student s:arrlist)
	{
		System.out.println(s);
	}
	System.out.println();
	
	Collections.sort(arrlist, new SortingById());
	System.out.println("After sorting by id");
	for(Student s:arrlist)
	{
		System.out.println(s);
	}
	System.out.println();
	Collections.sort(arrlist, new SortByCity());
	
	for(Student s:arrlist)
	{
		System.out.println(s);
	}
	System.out.println();
	}

	}
	
