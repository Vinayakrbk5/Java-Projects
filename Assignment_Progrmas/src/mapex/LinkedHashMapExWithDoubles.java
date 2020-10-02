package mapex;

import java.util.LinkedHashMap;

public class LinkedHashMapExWithDoubles {
	public static void main(String[] args) {
		LinkedHashMap<Double ,String> lset=new LinkedHashMap<>();
		lset.put(20.65, "Vinayak");
		lset.put(15.865, "Vishal");
		lset.put(25.467, "Nikhil");
		lset.put(30.986, "Savithri");
		System.out.println(lset);
		lset.putIfAbsent(20.234, "Chinmaye");
		System.out.println(lset);
	}

}
