package CollectionFramework;

import java.util.ArrayList;

public class ArrayListsInsideAnotherArrayList {
	public static void main(String[] args) {
	ArrayList<Integer> obj1=new ArrayList<>();
	obj1.add(10);
	obj1.add(20);
	obj1.add(30);
	System.out.println(obj1);
	
	ArrayList<String> obj2=new ArrayList<>();
	obj2.add("Karnataka");
	obj2.add("MP");
	obj2.add("AP");
	obj2.add("UP");
	System.out.println(obj2);
	
	ArrayList obj3=new ArrayList();   //   we can write like this also ArrayList<ArrayList> obj3=new ArrayList<>(); 
	obj3.add(obj1);					  //  because obj3 is of type ArrayList, as it contains array of arrayLists
	System.out.println(obj3);
	obj3.add(obj2);
	System.out.println(obj3);
	
	}

}
