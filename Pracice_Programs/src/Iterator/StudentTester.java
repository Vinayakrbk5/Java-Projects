package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentTester {
	public static void main(String[] args) {
		ArrayList<Student> arrlist=new ArrayList();
		arrlist.add(new Student("Vinayak",3,"Bangalore"));
		arrlist.add(new Student("Vishal",2,"Bagalkot"));
		arrlist.add(new Student("Sharath",6,"Udupi"));
		arrlist.add(new Student("Basavaraj",4,"Vijayapura"));
			
		System.out.println(arrlist);
		System.out.println("-------------------------");
		Iterator<Student> itr=arrlist.iterator();
		System.out.println("Elements printing using iterator");
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		System.out.println("removing an element using iterator");
		while(itr.hasNext())
		{
			if(itr.next().getCity().equals("Bangalore"))
			{
				itr.remove();
			}
		}
		System.out.println("After removing, elements are");
		for(Student i:arrlist)
		{
			System.out.println(i);
		}
		
	}

}
