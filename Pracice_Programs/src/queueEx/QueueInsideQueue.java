package queueEx;
// queueof queue is not possible because since sorting happens 
// there is no specific way to sort between objects so it will throw an error
import java.util.PriorityQueue;

public class QueueInsideQueue {
	public static void main(String[] args) {
		PriorityQueue<PriorityQueue> pqueue=new PriorityQueue<>();
		PriorityQueue<Integer> intq=new PriorityQueue<>();
		PriorityQueue<Integer> intq1=new PriorityQueue<>();
		
		intq.add(10);
		intq.add(54);
		intq.add(20);
		System.out.println(intq);
		
		intq1.add(25);
		intq1.add(10);
		System.out.println(intq1);
		
		pqueue.add(intq);
		pqueue.add(intq1);
		System.out.println(pqueue);
	}
}
