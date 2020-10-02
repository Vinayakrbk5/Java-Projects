package TreeSetEx;

import java.util.Comparator;

public class SortByInchus implements Comparator<Laptop> {

	@Override
	public int compare(Laptop l1, Laptop l2) {
		return l2.getInchus()-l1.getInchus();
	}
	

}
