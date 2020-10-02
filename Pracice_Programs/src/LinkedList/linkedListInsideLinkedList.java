package LinkedList;

import java.util.LinkedList;

public class linkedListInsideLinkedList {
	public static void main(String[] args) {
		LinkedList<LinkedList> Llist=new LinkedList<>();
		LinkedList<Integer> Ilist=new LinkedList<>();
		LinkedList<String> Slist=new LinkedList<>();
		
		Ilist.add(10);
		Ilist.add(20);
		System.out.println(Ilist);
		
		Slist.add("Vinayak");
		Slist.add("Sharath");
		System.out.println(Slist);
		Llist.add(Ilist);
		Llist.add(Slist);
		System.out.println(Llist);
	}

}
