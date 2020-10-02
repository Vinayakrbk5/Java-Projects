package com.xworkz.list;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StudentTester {


	public static void main(String[] args) {
		
		ArrayList<ArrayList<Student>> list=new ArrayList<>();
		ArrayList<Integer> arrList=new ArrayList<>();
		arrList.add(25);
		arrList.add(10);
		arrList.add(50);
		arrList.add(25);
		
		ArrayList<Student> studList=new ArrayList<>();
		studList.add(new Student(1, "Vinayak", "Bangalore"));
		studList.add(new Student(7, "Kashinath", "Mandya"));
		studList.add(new Student(5, "Narendra", "Hubli"));
		
		ArrayList<Student> linkList=new ArrayList<>();
		linkList.add(new Student(10, "shashi", "Kalburgi"));
		linkList.add(new Student(9, "Yamuna", "Bagalkot"));
		linkList.add(new Student(12, "Kavya", "Ilkal"));
		
		Iterator<Student> itr=studList.iterator();
		while(itr.hasNext()) {

			if(itr.next().getCity().equals("Bangalore"))
			{
				itr.remove();
			}
		}
			
			studList.forEach(p->System.out.println(p));
			System.out.println();
			ListIterator<Student> listItr=linkList.listIterator();
			while(listItr.hasNext())
			{
				if(listItr.next().getCity().equals("Bagalkot"))
				{
					listItr.set(new Student(100, "sumeeth", "Nippani"));
				}
				
			}
			linkList.forEach(p->System.out.println(p));
			}
		
}











