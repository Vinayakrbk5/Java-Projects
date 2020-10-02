package ComparableExapmles;

import java.util.ArrayList;
import java.util.Collections;

public class NameTester {
	public static void main(String[] args) {
		ArrayList<ArrayList> Arrobj=new ArrayList();
		ArrayList<Integer> Aobj1=new ArrayList();
		ArrayList<Integer> Aobj2=new ArrayList();
		ArrayList<Integer> Aobj3=new ArrayList();
		
		Aobj1.add(25);
		Aobj1.add(20);
		Aobj1.add(35);
		Aobj1.add(40);
		
		Aobj2.add(10);
		Aobj2.add(5);
		Aobj2.add(20);
		Aobj2.add(15);
		
		Aobj3.add(20);
		Aobj3.add(15);
		Aobj3.add(10);
		
		Arrobj.add(Aobj1);
		Arrobj.add(Aobj2);
		Arrobj.add(Aobj3);
		System.out.println("Before sorting");
		System.out.println(Arrobj);
		
		for(ArrayList i:Arrobj) {
		Collections.sort(i);
		}
		System.out.println("after sorting");
		System.out.println(Arrobj);
		for(ArrayList i:Arrobj)
		{
			for(int j=0;j<i.size();j++)
			{
			if(i.get(j).equals(20))
			{
			i.remove(j)	;
			}
			}
		}
		System.out.println("after operation");
		System.out.println(Arrobj);
	}
}
