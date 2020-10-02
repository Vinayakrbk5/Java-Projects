package ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentTesterUsingPreviousListIterator {
	public static void main(String[] args) {
		ArrayList<Student> arrlist=new ArrayList();
		arrlist.add(new Student("Vinayak",3,"Bangalore"));
		arrlist.add(new Student("Vishal",2,"Bagalkot"));
		arrlist.add(new Student("Sharath",6,"Udupi"));
		arrlist.add(new Student("Basavaraj",4,"Vijayapura"));
		for(Student i:arrlist)
		{
		System.out.println(i);
		}
		ListIterator<Student> listitr=arrlist.listIterator();
//		System.out.println("printing elements in reverse order");
		while(listitr.hasNext())
		{
		    listitr.next();   //  this is to move the pointer to the end of the arrayList
				
		}
//		while(listitr.hasPrevious())
//		{
//			System.out.println(listitr.previous());
//		}
//		System.out.println("-----------------------------");
//		while(listitr.hasNext())
//		{
//			if(listitr.next().getCity().equals("Udupi"))
//			{
//				listitr.remove();
//			}
//		}
//		System.out.println("After removing the elements are");
//		for(Student i:arrlist)
//		{
//			System.out.println(i);
//		}
		System.out.println("--------------------------");
//		while(listitr.hasPrevious())
//		{
//			if(listitr.previous().getName().equals("Vinayak"))
//			{
//				listitr.add(new Student("Rakesh",25,"Kalburgi"));
//			}
//		}
//		System.out.println("After adding");
//		for(Student i:arrlist)
//		{
//			System.out.println(i);
//		}
		
		System.out.println("-------------------");
		while(listitr.hasPrevious())
		{
			if(listitr.previous().getName().equals("Sharath"))
			{
				listitr.set(new Student("Rakesh",25,"Kalburgi"));
			}
		}
		System.out.println("After Replacing");
		for(Student i:arrlist)
		{
			System.out.println(i);
		}
		
	}
}
