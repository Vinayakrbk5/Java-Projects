package SortingUsingComparator;

import java.util.ArrayList;
import java.util.Collections;

public class OahTester {
	public static void main(String[] args) {
		ArrayList<OldAgeHome> oldagehome=new ArrayList();
		oldagehome.add(new OldAgeHome("Vinayak",25,3));
		oldagehome.add(new OldAgeHome("Vishal",23,5));
		oldagehome.add(new OldAgeHome("Sharath",26,5));
		oldagehome.add(new OldAgeHome("Basavaraj",21,4));
		
		System.out.println("Before Sorting");
		System.out.println(oldagehome);
		
		Collections.sort(oldagehome, new SortByName());
		System.out.println("After Sorting by names");
		System.out.println(oldagehome);
		
		Collections.sort(oldagehome, new SortByAge());
		System.out.println("After Sorting by Age");
		System.out.println(oldagehome);
		
	}

}
