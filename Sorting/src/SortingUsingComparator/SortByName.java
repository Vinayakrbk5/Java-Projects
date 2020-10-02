package SortingUsingComparator;

import java.util.Comparator;

public class SortByName implements Comparator<OldAgeHome> {

	
	@Override
	public int compare(OldAgeHome obj1, OldAgeHome obj2) {
		
		return obj1.getName().compareTo(obj2.getName());
		
	}
}
