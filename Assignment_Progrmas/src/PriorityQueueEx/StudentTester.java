package PriorityQueueEx;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentTester {
	public static void main(String[] args) {
		PriorityQueue<Student> sq=new PriorityQueue<>(new Comparator<Student>() {
			public int compare(Student s1,Student s2)
			{
				return s1.getId()-s2.getId();
			}
		});
		sq.add(new Student("Vinayak",3));
		sq.add(new Student("Bharath",7));
		sq.add(new Student("Harish",4));
		sq.add(new Student("Nakul",5));
		System.out.println(sq);
	}

}
