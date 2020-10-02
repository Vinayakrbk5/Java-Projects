package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class StudentTester {
	public static void main(String[] args) {
		LinkedList<Student> slist=new LinkedList<>();
		slist.add(new Student("Vinayak",3));
		slist.add(new Student("Bharath",4));
		slist.add(new Student("Chinmaye",2));
		System.out.println("Before Sorting:"+slist);
		Collections.sort(slist);
		System.out.println("After Sorting:"+slist);
		slist.remove();
		System.out.println(slist);
		
		System.out.println(slist.offer(new Student("Sharath",1)));
		System.out.println(slist);
		
		System.out.println(slist.getLast());
		
//		slist.clear();
//		System.out.println(slist);
		
		System.out.println(slist.poll());
		System.out.println(slist);
		slist.pop();
		System.out.println(slist);
		
	}

}
