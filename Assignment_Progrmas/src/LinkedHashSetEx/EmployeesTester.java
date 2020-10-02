package LinkedHashSetEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class EmployeesTester {
	public static void main(String[] args) {
		LinkedHashSet<Employees> elist=new LinkedHashSet<>();
		elist.add(new Employees("Vinayak",245,"Production"));
		elist.add(new Employees("Sharath",452,"Testing"));
		elist.add(new Employees("Basavaraj",134,"Development"));
		System.out.println("Employees detials is :"+elist);
		
		ArrayList<Employees> alist=new ArrayList<>(elist);
		Collections.sort(alist, new SortById());
		System.out.println("Employees list id wise is :"+alist);
		
		Collections.sort(alist,Collections.reverseOrder(new SortById()));
		System.out.println("Employees details in id is :"+alist);
	}

}
