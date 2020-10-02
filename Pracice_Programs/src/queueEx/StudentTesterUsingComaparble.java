package queueEx;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Spliterator;
// if we don't implement Comparable or Comparator interface it will give error because since it uses sorting technique
// we need to compare with particular field
public class StudentTesterUsingComaparble {
	public static void main(String[] args) {
		PriorityQueue<Student> stqueue=new PriorityQueue<>();
		stqueue.add(new Student("Vinayak",2,"ECE"));
		stqueue.add(new Student("Sharath",5,"CSE"));
		stqueue.add(new Student("Bharath",4,"ISE"));
		stqueue.add(new Student("Savithri",6,"IM"));
		System.out.println(stqueue);
		System.out.println("The element to be removed is :"+stqueue.remove());
		System.out.println("After removing the queue is :"+stqueue);
		System.out.println("First elemnt is :"+stqueue.peek()); // don't removes first element
		System.out.println(stqueue.isEmpty()); // if empty returns true

		Iterator<Student> itr=stqueue.iterator();
		System.out.println("Queue elements using iterator are :");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
