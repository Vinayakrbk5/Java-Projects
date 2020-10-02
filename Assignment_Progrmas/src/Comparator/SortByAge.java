package Comparator;

import java.util.Comparator;

public class SortByAge implements Comparator<OldAgeHome>{

	public SortByAge()
	{
		System.out.println("Sorting By Age");
	}
	@Override
	public int compare(OldAgeHome c1, OldAgeHome c2) {
		return c1.getAge()-c2.getAge();
	}

}
