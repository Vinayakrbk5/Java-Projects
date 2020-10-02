package teston25thapril;

import java.util.Iterator;
import java.util.TreeSet;

public class SchoolTester {
	public static void main(String[] args) {

		TreeSet<School> tset = new TreeSet<>();

		tset.add(new School(2, "Rabkavi", 587314, 20000.00));
		tset.add(new School(5, "Jamakhandi", 587315, 75000.00));
		tset.add(new School(3, "R R Nagar", 560098, 35000.00));
		tset.add(new School(6, "Kengeri", 786454, 40000.00));

		System.out.println("School deatil is :");
		Iterator<School> itr = tset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
