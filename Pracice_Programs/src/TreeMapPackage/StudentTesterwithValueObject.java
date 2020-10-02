package TreeMapPackage;

import java.util.TreeMap;

public class StudentTesterwithValueObject {
	public static void main(String[] args) {
		TreeMap<Integer,Student> sset=new TreeMap<>();
		sset.put(3, new Student("Vinayak",2));
		sset.put(5, new Student("Sharath",8));
		sset.put(7, new Student("Chinmaye",9));
		sset.put(2, new Student("Nikhil",4));
		System.out.println(sset);
		sset.put(3, new Student("Vinay",2));
		System.out.println(sset);
	}

}
