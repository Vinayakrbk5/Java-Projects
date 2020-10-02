package Comparator;

import java.util.Comparator;

public class SortByName implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Student s1=(Student)obj1;
		Student s2=(Student)obj2;
		return s1.getName().compareTo(s2.getName());
	}

}
