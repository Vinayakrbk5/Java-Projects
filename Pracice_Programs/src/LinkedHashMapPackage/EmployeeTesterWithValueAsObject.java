package LinkedHashMapPackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class EmployeeTesterWithValueAsObject {
	public static void main(String[] args) {
		LinkedHashMap<Integer,Employee> eset=new LinkedHashMap<>();
		eset.put(24, new Employee("vinayak",35));
		eset.put(12, new Employee("Sharath",65));
		eset.put(76, new Employee("Karan",56));
		System.out.println(eset);
		Iterator<Entry<Integer,Employee>> itr=eset.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println("Values are :"+itr.next());
		}
	}

}
