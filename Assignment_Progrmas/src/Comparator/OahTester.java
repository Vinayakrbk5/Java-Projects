package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class OahTester {
	public static void main(String[] args) {
		ArrayList<OldAgeHome> oah = new ArrayList<>();
		oah.add(new OldAgeHome(1, "Vinayak", 25));
		oah.add(new OldAgeHome(2, "Vishal", 23));
		oah.add(new OldAgeHome(3, "Vinayak", 21));
		oah.add(new OldAgeHome(4, "Basavaraj", 24));

		System.out.println("Elements are: ");
		for (OldAgeHome i : oah) {
			System.out.println(i);
		}

		System.out.println("-----------------------");
		Collections.sort(oah, new SortByName());
		for (OldAgeHome i : oah) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		Collections.sort(oah, new SortByAge());
		for (OldAgeHome i : oah) {
			System.out.println(i);
		}

	}

}
