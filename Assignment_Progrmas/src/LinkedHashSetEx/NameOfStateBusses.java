package LinkedHashSetEx;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class NameOfStateBusses {
	public static void main(String[] args) {
		LinkedHashSet<String> names=new LinkedHashSet<>();
		names.add("KSRTC");
		names.add("BMTC");
		names.add("APSRTC");
		names.add("MHRTC");
		names.add("TMRTC");
		System.out.println("Name of state busses are :"+names);
		LinkedList<String> llist=new LinkedList<>(names);
		Collections.sort(llist);
		System.out.println("State bus names in ascending order is :"+llist);
		
		Collections.sort(llist,Collections.reverseOrder());
		System.out.println("State bus names in Descending order is :"+llist);
		
	}

}
