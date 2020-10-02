package CollectionFramework;

import java.util.ArrayList;

public class ArrayListEx //extends ArrayList 
{
	public static void main(String[] args) {
		ArrayList<Object> obj1=new ArrayList<>();
		obj1.add(20);
		obj1.add("Vinayak");
		obj1.add(true);
		obj1.add(76.88);
		obj1.add('V');
		System.out.println(obj1);
		
		ArrayList<Object> obj2=new ArrayList<>();
		obj2.add(45);
		obj2.add("Bhilawadi");
		obj2.add(false);
		obj2.add(54.1235);
		obj2.add('B');
		System.out.println("=====================");
		System.out.println(obj2.get(0).getClass());
		System.out.println(obj2.get(1).getClass());
		System.out.println("=========================");
		
//		obj1.addAll(obj2);
//		System.out.println(obj1);
		obj1.add(obj2);
		System.out.println("elements of obj1 are : "+obj1);
//		obj1.clear();
//		System.out.println("Array List is "+obj1);
		System.out.println(obj1.contains(20));
		System.out.println("containsAll of obj1 and obj2 is "+obj2.containsAll(obj1));  //  it compares  two objects and returns true if all are same else false
		System.out.println("equals of obj1 and obj1 is "+obj1.equals(obj1));       // it also compares and retirns true or false
		System.out.println("get of value of index 1: "+obj1.get(1));            // it takes integer arg as index and returns particular indexed value
		System.out.println("getClass() of obj1 is :"+obj1.getClass());   //  prints fully qualified class name with project name same as toString() method
		System.out.println("hashCode() of obj1 is "+obj1.hashCode());    //  prints hashCode() of obj1
		System.out.println( "index of obj2 in obj1 is "+obj1.indexOf(obj2));
		System.out.println("index of Bhilawadi in obj1 is :"+obj1.indexOf("Bhilawadi"));
		System.out.println("obj1 is empty or not :"+obj1.isEmpty());
		System.out.println("last index of obj2 is :"+obj1.lastIndexOf(obj2));
		System.out.println("last index of Vibayak is :"+obj1.lastIndexOf("Vinayak"));
		obj1.remove(new Integer(20));       // obj1.remove(20); gives exception because it takes it as index not as element
		System.out.println(obj1);
		obj1.set(0, 20);                    // it sets the integer value 20 to the 0th position of list
		System.out.println(obj1);
		System.out.println(obj1.size());    //  it prints the size of list
		System.out.println(obj1.getClass());
		
		
	}

}
