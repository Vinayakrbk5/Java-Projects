package HashAndLinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Double> Hset=new HashSet();
		Hset.add(30.64);
		Hset.add(30.76);
		Hset.add(50.54);
		Hset.add(15.98);
		Hset.add(45.67);
		Hset.add(50.54);
		
		System.out.println("Has Set :"+Hset);
		Hset.add(null);
		System.out.println("Has Set :"+Hset);
		
		
		LinkedHashSet<Double> lset=new LinkedHashSet();
		lset.add(30.64);
		lset.add(30.76);
		lset.add(50.54);
		lset.add(15.98);
		lset.add(45.67);
		lset.add(50.54);
		System.out.println("Linked Has Set :"+lset);
		System.out.println("Linked Has Set :"+lset);
		lset.add(null);
		lset.add(null);
		
		System.out.println("Linked Has Set :"+lset);
		
		
	}

}
