package ComparableUsedAsComparator;

import java.util.ArrayList;
import java.util.Collections;

import SortingUsingComparator.OldAgeHome;


public class OahTester {

	public static void main(String[] args) {
		ArrayList<OldAgeHome> oldage=new ArrayList();
		oldage.add(new OldAgeHome("Vinayak",25,3));
		oldage.add(new OldAgeHome("Vishal",23,5));
		oldage.add(new OldAgeHome("Sharath",26,5));
		oldage.add(new OldAgeHome("Basavaraj",21,4));
		
		System.out.println("before Sorting");
		System.out.println(oldage);
		Collections.sort(oldage,new OldAgeHome("Vinayak",25,3));
		System.out.println("After Sorting");
		System.out.println(oldage);
		
	}
}
