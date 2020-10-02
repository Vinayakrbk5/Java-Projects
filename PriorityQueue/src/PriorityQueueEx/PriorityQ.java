package PriorityQueueEx;

import java.util.PriorityQueue;

public class PriorityQ {
	public static void main(String[] args) {
		PriorityQueue<Integer> numobj=new PriorityQueue();
		numobj.add(20);
		numobj.add(50);
		numobj.add(30);
		numobj.add(15);
		numobj.add(40);
		numobj.add(10);
		
		System.out.println(numobj);
		System.out.println(numobj.peek());
		System.out.println(numobj.poll());
	}

}
