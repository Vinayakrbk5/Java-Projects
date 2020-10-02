package LinkedListEx;

import java.util.Collections;
import java.util.LinkedList;

public class NationTester {
	public static void main(String[] args) {
		LinkedList<Nation> natlist=new LinkedList<>();
		natlist.add(new Nation("Karnataka",29,"Bangalore"));
		natlist.add(new Nation("Maharastra",23,"Mumbai"));
		natlist.add(new Nation("Rajasthan",21,"Jaipur"));
		System.out.println("State Details: "+natlist);
		
		Collections.sort(natlist);
		System.out.println("Sorted By State Code :"+natlist);
		
		System.out.println("_ _ _Operations On LinkedList_ _ _");
		System.out.println("Displays First Element: "+natlist.element());
		
		System.out.println(natlist.offer(new Nation("Andhra Pradesh",24,"Hydarabad")));// prints true if we able to add
		// we can also use offerfirst-> to add at first place, offerlast-> to add at last end of list
		System.out.println("New List after adding :"+natlist);
		
//		removefirst()-> remove first element
//		removelast()-> remove last element
//		removefirstoccurence("obj or element name")-> remove first element of given obj or elemenet from list
//													  if it matches with given one traversing head to tail
//		removelastoccurence("obj or element name")-> remove first element of given obj or elemenet from list
//												     if it matches with given one traversing tail to head
	
		System.out.println("Element with index 2 is :"+natlist.get(2));
//		get(index)-> prints with specified index value
//		getfirst()-> prints first element
//		getlast()-> prints last element
		
		System.out.println("First element is :"+natlist.peek());
//		peek() -> prints first element but doesnot remove -> inheriting from queue
//		peekfirst() -> prints first element but doesnot remove
//		peeklast() -> prints last element but doesnot remove
		
		System.out.println("First element to be removed is :"+natlist.poll());
//		poll() -> prints and removes first element -> inheriting from queue
//		pollfirst() -> prints and removes first element
//		polllast() -> prints and removes last element
		
		System.out.println(natlist.offer(new Nation("Uttar Pradesh",27,"Ranchi")));
		System.out.println("New List after adding :"+natlist);
//		offer()-> adds new element to end of list
//		offerfirst() -> adds new element to begining of list
//		offerlast() -> adds new element to the end of list
//		add(element or object)-> adds to end of list
//		add(index, element or object); -> adds element to the specified index
//		addLast(element or object);  -> adds to end of list
//		addFirst(element or object); -> adds to beginning of list
		
		natlist.push(new Nation("Tamilnadu",15,"Chennai")); // push()-> insert at begining of list
		System.out.println(natlist);
		natlist.pop();  								    // pop() -> removes first element
		System.out.println(natlist.pop());
		
		natlist.set(0, new Nation("Gujarath",10,"Gandinagar")); // set(index,element) -> replaces element
		System.out.println(natlist);
		
		System.out.println(natlist.subList(0, 2));
//		sublist(from index,toindex)-> fromindex is inclusive and toindex is exclusive
		
//		clear() -> remove all the elements from the list
		
	}

}
