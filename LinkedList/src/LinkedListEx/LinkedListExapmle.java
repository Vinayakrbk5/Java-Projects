package LinkedListEx;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExapmle {
	public static void main(String[] args) {
		LinkedList<String> linklist=new LinkedList();
		linklist.add("Bangalore");
		linklist.add("Bagalkot");
		linklist.add("Mangalore");
		linklist.add("Udupi");
		System.out.println(linklist);
		
		boolean containsblr=linklist.contains("Bangalore");
		if(containsblr)
		{
			System.out.println("Bangalore is present in list");
		}
		else
		{
			System.out.println("Bangalore is not present in bangalore");
		}
		System.out.println("peek: "+linklist.peek());
		System.out.println("Poll: "+linklist.poll());
		System.out.println(linklist);
		
		System.out.println(linklist.offer("Vijayapura"));
		System.out.println(linklist);
		
		System.out.println(linklist.get(2));
		System.out.println();
		
		System.out.println(linklist.pop());
		linklist.push("Kalburgi");
		System.out.println(linklist);
		System.out.println("Removed Element is: "+linklist.remove());
		System.out.println("Removed last element is :"+linklist.removeLast());
		System.out.println(linklist);
		linklist.push("Bagalkot");
		linklist.push("Mysore");
		linklist.offerLast("Bagalkot");
		System.out.println("New linked list is :"+linklist);
		
//		Collections.sort(linklist);
//		System.out.println("Sorted list is :"+linklist);
		linklist.removeFirstOccurrence("Bagalkot"); // removes first duplicate element
		System.out.println("remove firstoccurence :"+linklist);
	}

}
