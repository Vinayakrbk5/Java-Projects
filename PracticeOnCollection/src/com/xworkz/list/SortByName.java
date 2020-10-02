package com.xworkz.list;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		return stud1.getStName().compareTo(stud2.getStName());
	}


}
