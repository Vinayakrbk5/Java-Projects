package LinkedHashSetEx;

import java.util.Comparator;

public class SortById  implements Comparator<Employees> {

	@Override
	public int compare(Employees e1, Employees e2) {
		return e1.getId()-e2.getId();
	}

}
