package Comparator;

import java.util.Comparator;

public class SortByName implements Comparator<OldAgeHome> {
	public SortByName()
	{
		System.out.println("Sorting By Name");
	}

	@Override
	public int compare(OldAgeHome o1, OldAgeHome o2) {
		int num=o1.getName().compareTo(o2.getName());
		if(num==0)
		{
			num=o1.getAge()-o2.getAge();
		}
		return num;
	}
	

}
