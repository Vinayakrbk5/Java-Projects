package LinkedHashMapPackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StudentTesterwithKeyAsObject {
	public static void main(String[] args) {
		LinkedHashMap<Student,Character> sset=new LinkedHashMap<>();
		sset.put(new Student("Vinayak",23), 'V');
		sset.put(new Student("Arun",45), 'A');
		sset.put(new Student("Karan",35), 'K');
		System.out.println(sset);
		Iterator<Entry<Student,Character>> itr=sset.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println("Values are :"+itr.next());
		}
		Collection<Student> key=sset.keySet();
		System.out.println(key);
	}

}
