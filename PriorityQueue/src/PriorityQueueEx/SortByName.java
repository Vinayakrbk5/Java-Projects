package PriorityQueueEx;

import java.util.Comparator;

public class SortByName implements Comparator <Zoom>{
	public SortByName()
	{
		System.out.println("Sorting By Name");
	}

	@Override
	public int compare(Zoom o1, Zoom o2) {
		return o1.getName().compareTo(o2.getName());
	}
	

}
