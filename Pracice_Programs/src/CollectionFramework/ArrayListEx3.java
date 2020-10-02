package CollectionFramework;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		ArrayList<ArrayList> obj=new ArrayList();
		ArrayList<Integer> obj1=new ArrayList();
		ArrayList<Integer> obj2=new ArrayList();
		
		obj1.add(10);
		obj1.add(20);
		obj1.add(30);
		System.out.println(obj1);
		
		obj2.add(70);
		obj2.add(80);
		obj2.add(90);
		obj2.add(100);
		System.out.println(obj2);
		
		obj.add(obj1);
		obj.add(obj2);
		System.out.println(obj);
		obj.addAll(obj);
		System.out.println(obj);
	}

}
