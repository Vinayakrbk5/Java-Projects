// 2).Consider a custom object Person(int id, String name, string emailid)
//     a) create Linked List
//     b) Add 5 values and sort by by there name

package teston25thapril;

import java.util.Collections;
import java.util.LinkedList;

public class EmployeeTester {
	public static void main(String[] args) {
		LinkedList<Employee> linklist = new LinkedList<>();
		linklist.add(new Employee(1, "Bangalore", "Vg@yahoo.com"));
		linklist.add(new Employee(5, "Vijaypur", "Vg@yahoo.com"));
		linklist.add(new Employee(3, "Dharwad", "Dg@hotmail.com"));
		linklist.add(new Employee(7, "Hassan", "Ha@yahoo.com"));
		linklist.add(new Employee(4, "Bangalore", "Bg@yahoo.com"));

		System.out.println("Before Sorting list by Name is:");
		for (Employee i : linklist)
			System.out.println(i);

		System.out.println();
		Collections.sort(linklist);
		System.out.println("After Sorting list by Name is :");
		for (Employee i : linklist)
			System.out.println(i);
	}

}
