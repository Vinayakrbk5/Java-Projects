package PriorityQueueEx;

import java.util.PriorityQueue;

public class CityNames {	
	public static void main(String[] args) {
		PriorityQueue<String> cnames=new PriorityQueue<>();
			
		cnames.add("Bangalore");
		cnames.add("Udupi");
		cnames.add("Bagalkot");
		cnames.add("Mumbai");
		cnames.add("Kalburgi");
		System.out.println("City names :"+cnames);
	}

}
