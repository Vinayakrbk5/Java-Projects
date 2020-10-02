package Comparator;

import java.util.Comparator;

public class SortByCity implements Comparator {

	public SortByCity()
	{
		System.out.println("After sorting by City");
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		Student c1=(Student)obj1;
		Student c2=(Student) obj2;
		return c1.getCity().compareTo(c2.getCity());
	}

}
