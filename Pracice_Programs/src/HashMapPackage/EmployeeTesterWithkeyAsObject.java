package HashMapPackage;

import java.util.HashMap;
import java.util.TreeMap;

public class EmployeeTesterWithkeyAsObject {
	public static void main(String[] args) {
		HashMap<Employee,Character> emap=new HashMap<>();
		emap.put(new Employee("Vinayak",34), 'V');
		emap.put(new Employee("Arun",25), 'A');
//		System.out.println(emap);
		emap.put(new Employee("Basavaraj",49), 'V');
//		System.out.println(emap);
		
		emap.put(new Employee("Karan",39), 'V');
//		System.out.println(emap);
		
//		emap.put(new Employee("vinayak",35), 'C');
//		System.out.println(emap);
//		
		TreeMap<Employee,Character> tmap=new TreeMap<>();
		tmap.putAll(emap);
		System.out.println(tmap);
	}

}
