package queueEx;

import java.util.Comparator;

public class SortByname implements Comparator<StudentClass> {
	public SortByname()
	{
		System.out.println("Sorting By Name");
	}

	@Override
	public int compare(StudentClass s1, StudentClass s2) {
		return s1.getName().compareTo(s2.getName());
	}

}
