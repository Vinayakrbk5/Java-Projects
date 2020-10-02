package ArrayListEx;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(10);
	ar.add(null);
	ar.add("Hello");
	ar.add(true);
	ar.add('V');
	ar.add('\0');
	ar.add(new Object());
	System.out.println(ar);
	System.out.println(ar.size());
	System.out.println(ar.isEmpty());
	System.out.println(ar.hashCode());
	System.out.println(ar.indexOf('V'));
	System.out.println(ar.toString());
	for(Object ob:ar)
	{
		System.out.println("Element :"+ob);
	}
	System.out.println("-----------------------------");
	for(Object ob:ar)
	{
		System.out.println("Element :"+ob);
	}
	//System.out.println(ar.);
	ar.clear();
	System.out.println(ar);
	}
}
