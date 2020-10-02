package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class SimpleLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> linklist=new LinkedList<>();
		linklist.add(20);
		linklist.add(10);
		linklist.add(25);
		linklist.add(15);
		linklist.add(10);
		System.out.println("Before Sorting:"+linklist);
		Collections.sort(linklist);
		System.out.println("After Sorting :"+linklist);
		
		System.out.println(linklist.offerFirst(55));
		System.err.println(linklist);
		
		System.out.println(linklist.removeFirstOccurrence(20));
		System.out.println("Remove:"+linklist);
		
		System.out.println("First element:"+linklist.element());
		System.out.println("Last element is :"+linklist.getLast());
		System.out.println(linklist.peek());
		System.out.println(linklist.peekFirst());
		System.out.println(linklist.pollLast());
		System.out.println(linklist);
		
		System.out.println(linklist.set(1,40));  // replaces given element to the given index
		System.out.println(linklist);
		
		linklist.add(0, 100);//  add element to the given index
		System.out.println(linklist);
		
		System.out.println(linklist.pop());  // removes the first element
		System.out.println(linklist);
		
		linklist.push(37);  // add element to the first position
		System.out.println(linklist);
	}

}
