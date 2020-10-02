package TreeSetEx;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class LaptopTester {
	public static void main(String[] args) {
		TreeSet<Laptop> lset=new TreeSet<>(new Comparator<Laptop>()
				{
			public int compare(Laptop l1,Laptop l2)
			{
				return l1.getInchus()-l2.getInchus();
			}
				});
		lset.add(new Laptop("HP",45000,40));
		lset.add(new Laptop("Dell",50000,32));
		lset.add(new Laptop("Lenovo",35000,30));
		System.out.println("Laptop Details :"+lset);
		
//		Collections.sort(lset, Collections.reverseOrder());
		
	}

}
