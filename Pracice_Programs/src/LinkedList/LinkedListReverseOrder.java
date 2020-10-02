package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverseOrder {
	public static void main(String[] args) {
		ArrayList<Integer> Alist=new ArrayList<>();
		LinkedList<Integer> Ilist=new LinkedList<>();
		Ilist.add(30);
		Ilist.add(20);
		Ilist.add(25);
		Ilist.add(10);
		System.out.println("Befor Sorting: "+Ilist);
		Collections.sort(Ilist);
		System.out.println("In Ascending order : "+Ilist);
		Collections.sort(Ilist,Collections.reverseOrder());
		System.out.println("In descending order Sorting : "+Ilist);
		}

}
