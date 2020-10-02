package queueEx;

import java.util.PriorityQueue;
import java.util.Spliterator;

public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue=new PriorityQueue();
		PriorityQueue<String> squeue=new PriorityQueue();
		pqueue.add(30);  // The difference is that offer() will return false 
					    //	if it fails to insert the element on a size restricted Queue,
		                 // whereas add() will throw an IllegalStateException .
		pqueue.add(25);
		pqueue.add(50);
		pqueue.add(15);
		pqueue.add(20);
		
		squeue.add("Vinayak");
		squeue.add("Sharath");
		squeue.add("Vishal");
		System.out.println(squeue);
		System.out.println("The array is :"+pqueue);
		System.out.println("The first element is :"+pqueue.peek());
		System.out.println(pqueue.offer(30));  // returns true because we are to insert element into it
		System.out.println("New array is :"+pqueue);
		 
		Spliterator<Integer> splititr=pqueue.spliterator();
		if(splititr.hasCharacteristics(Spliterator.ORDERED)) {
		    System.out.println("DISTINCT");
		}
		}
		
	}

