package TreeMapPackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class EmployeeTesterWithKeyObject {
	public static void main(String[] args) {
		TreeMap<Employee,Integer> emap=new TreeMap<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEid().compareTo(e2.getEid());
			}
		});
		
		Employee e1=new Employee("Karnataka",24);
		Employee e2=new Employee("Maharastra",7);
		Employee e3=new Employee("Karnataka",24);
		Employee e4=new Employee("Gujarath",246);
		Employee e5=new Employee("Gujarath",101);
		
		System.out.println("e1==e3:"+(e1==e3));
		System.out.println(e1.equals(e3));
		
		emap.put(e1, 246);
		emap.put(e2, 67);
		emap.put(e3, 35);
		emap.put(e4, 45);
		emap.put(e5, 89);
		
//		emap.put(new Employee("Karnataka",24), 246);
//		emap.put(new Employee("Maharastra",7), 67);
//		emap.put(new Employee("Gujarath",4), 35);
//		emap.put(new Employee("Karnataka", 2),24);
		
//		System.out.println(emap);
		System.out.println(e1.getName().hashCode());
		System.out.println(e3.getName().hashCode());
		System.out.println(e1.equals(e3));
		System.out.println(e4.getName().hashCode());
		System.out.println(e5.getName().hashCode());
		System.out.println(e4.equals(e5));
		
		Iterator<Entry<Employee,Integer>> itr=emap.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
