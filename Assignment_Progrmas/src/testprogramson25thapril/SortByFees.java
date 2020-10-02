package testprogramson25thapril;

import java.util.Comparator;

public class SortByFees implements Comparator<School> {

	@Override
	public int compare(School o1, School o2) {
		return o1.getFees().compareTo(o2.getFees());
	}

}
