package SortingUsingComparator;

import java.util.Comparator;

public class SortByAge implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		OldAgeHome o1=(OldAgeHome)obj1;
		OldAgeHome o2=(OldAgeHome)obj2;
		return o1.getAge()-o2.getAge();
	}
	

}
