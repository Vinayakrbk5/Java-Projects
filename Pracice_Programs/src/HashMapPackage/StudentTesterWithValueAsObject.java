package HashMapPackage;

import java.util.HashMap;
import java.util.Map;
//methods are: put(),get(),remove(),clear(),isempty(),putall(),replace(),keyset(),valueset(),entryset(),contains()

public class StudentTesterWithValueAsObject {
	public static void main(String[] args) {
		HashMap<Integer,Student> stmap=new HashMap<>();
		stmap.put(234, new Student("Vinayak",23));
		stmap.put(124, new Student("Basavaraj",24));
		stmap.put(454, new Student("Kalam",45));
		System.out.println(stmap);
		stmap.put(234, new Student("Vishal",25));
		System.out.println(stmap);
		stmap.put(765, new Student("Kalam",45));
		System.out.println(stmap);
		System.out.println(stmap.get(234));
		 
		System.out.println("printing using entry set");
		for(Map.Entry<Integer,Student> itr: stmap.entrySet()) {
		System.out.println(itr.getKey()+" and "+itr.getValue());
		
	}
	}
}
