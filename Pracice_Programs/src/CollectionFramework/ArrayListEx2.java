package CollectionFramework;

import java.util.ArrayList;

public class ArrayListEx2 extends ArrayList {
	public static void main(String[] args) {
		ArrayListEx2 obj=new ArrayListEx2();
		ArrayListEx2 obj2=new ArrayListEx2();
		ArrayListEx2 newobj=new ArrayListEx2();
		
		
		obj.add(48);
		obj.add("Vinayak");
		obj.add(true);
		obj.add(null);
		
		obj2.add("India");
		obj2.add(89);
		obj2.add(false);
		obj2.add(null);
		
		System.out.println(obj.toString());
		System.out.println(obj2);
		
		newobj.add(obj);
		newobj.add(obj2);
		System.out.println(newobj);
		newobj.addAll(obj2);
		System.out.println(newobj);
	}
	

}
