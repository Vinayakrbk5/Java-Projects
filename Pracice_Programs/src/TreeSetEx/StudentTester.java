package TreeSetEx;

import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class StudentTester {
	public static void main(String[] args) {
		TreeSet<Student> Tset=new TreeSet<>();
		Tset.add(new Student("Vinayak",4));
		Tset.add(new Student("Basavaraj",6));
		Tset.add(new Student("Sharath",2));
		Tset.add(new Student("Nikhil",5));
		System.out.println(Tset);

		LinkedList<Student> Llist=new LinkedList<>(Tset);
		Collections.sort(Llist,Collections.reverseOrder());
		System.out.println("Reverse order by id :"+Llist);
		
		
	}

}
