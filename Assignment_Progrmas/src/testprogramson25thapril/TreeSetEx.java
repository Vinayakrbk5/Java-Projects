package testprogramson25thapril;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lset=new LinkedHashSet<>();
		lset.add(20);
		lset.add(10);
		lset.add(15);
		lset.add(5);
		System.out.println(lset);
		
		LinkedList<Integer> llist=new LinkedList<>(lset);
		System.out.println(llist);
		Collections.sort(llist);
		System.out.println(llist);
		Collections.sort(llist,Collections.reverseOrder());
		System.out.println(llist);
		
//		TreeSet<Integer> tset=new TreeSet<>(new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer i1, Integer i2) {
//				return i2.compareTo(i1);
//			}
//			
//		});
//		tset.addAll(lset);
//		System.out.println(tset);
//		
	}

}
