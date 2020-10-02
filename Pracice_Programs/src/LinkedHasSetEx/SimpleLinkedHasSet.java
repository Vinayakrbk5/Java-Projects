package LinkedHasSetEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SimpleLinkedHasSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lset=new LinkedHashSet<>();
		lset.add(20);
		lset.add(25);
		lset.add(10);
		lset.add(30);
		lset.add(15);
		System.out.println(lset);
		lset.remove(20);
		lset.add(30);
		System.out.println(lset);
//		lset.add(null);
//		lset.add(null);
		System.out.println(lset);
		ArrayList<Integer> alist=new ArrayList<>(lset);
		Collections.sort(alist);
		System.out.println("Sorted ascending using arraylist :"+alist);
		
		Collections.sort(alist,Collections.reverseOrder());
		System.out.println("Sorted descending using arraylist :"+alist);
	}

}
