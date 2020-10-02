package WrapperClassPrograms;

import java.util.ArrayList;

public class WrapperClassEx1 {
	public static void main(String[] args) {
		ArrayList<ArrayList> obj=new ArrayList();
		ArrayList<Integer> obj1=new ArrayList();
		ArrayList<Integer> obj2=new ArrayList();

		obj1.add(500);
		obj1.add(550);
		
		obj2.add(20);
		obj2.add(30);
		
		obj.add(obj1);
		obj.add(obj2);
		System.out.println(obj);
		System.out.println(obj.get(1));
		
		for (int i=0;i<obj.size();i++)
		{
			for(int j=0;j<obj.get(i).size();j++)
			{
				System.out.print(obj.get(i).get(j)+"  ");
			}
			System.out.println();
		}	
	}
	}
