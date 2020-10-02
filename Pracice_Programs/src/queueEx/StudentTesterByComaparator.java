package queueEx;

import java.util.PriorityQueue;

public class StudentTesterByComaparator {
	public static void main(String[] args) {
		PriorityQueue<StudentClass> stqueue=new PriorityQueue<>(new SortByname());
		stqueue.add(new StudentClass("Vinayak",2,"ECE"));
		stqueue.add(new StudentClass("Sharath",5,"CSE"));
		stqueue.add(new StudentClass("Bharath",4,"ISE"));
		stqueue.add(new StudentClass("Savithri",6,"IM"));
		System.out.println(stqueue);
		
		System.out.println(stqueue.offer(new StudentClass("Nikhil",7,"ME"))); // adds element 
		System.out.println(stqueue);
		
		System.out.println(stqueue.peek()); // just displays first element
		System.out.println(stqueue);
		
		System.out.println(stqueue.poll()); // removes first element
		System.out.println(stqueue);
		
		System.out.println(stqueue.element()); // just displays first element
		System.out.println(stqueue);
		
	}

}
