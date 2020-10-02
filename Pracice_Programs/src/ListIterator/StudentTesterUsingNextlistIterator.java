package ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentTesterUsingNextlistIterator {
	public static void main(String[] args) {
	ArrayList<Student> arrlist=new ArrayList();
	arrlist.add(new Student("Vinayak",3,"Bangalore"));
	arrlist.add(new Student("Vishal",2,"Bagalkot"));
	arrlist.add(new Student("Sharath",6,"Udupi"));
	arrlist.add(new Student("Basavaraj",4,"Vijayapura"));
		
	System.out.println(arrlist);
	System.out.println("-------------------");
	ListIterator<Student> listitr=arrlist.listIterator();
	System.out.println("_ _ _Elements using List Iterator are_ _ _");
//	while(listitr.hasNext())
//	{
//		System.out.println(listitr.next());
//	}
//	System.out.println(listitr.nextIndex());
	
//	while(listitr.hasNext())
//	{
//		if(listitr.next().getId()==3)
//		{
//			listitr.remove();
//		}
//	}
//	System.out.println("After remove operation elements are");
//	for(Student i:arrlist)
//	{
//		System.out.println(i);
//	}
	
//	while(listitr.hasNext())
//	{
//		if(listitr.next().getCity().equals("Bangalore"))
//		{
//			listitr.add(new Student("Madava",10,"Belguam"));
//		}
//	}
//	System.out.println("After add Operation");
//	for(Student i:arrlist)
//	{
//		System.out.println(i);
//	}
	while(listitr.hasNext())
	{
		if(listitr.next().getName().equalsIgnoreCase("sharath"))
		{
			listitr.set(new Student("Madava",10,"Belguam"));
		}
	}
	System.out.println("After add Operation");
	for(Student i:arrlist)
	{
		System.out.println(i);
	}
	}
}
