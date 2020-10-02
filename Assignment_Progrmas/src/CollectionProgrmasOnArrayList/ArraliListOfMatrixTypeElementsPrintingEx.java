package CollectionProgrmasOnArrayList;

import java.util.ArrayList;

public class ArraliListOfMatrixTypeElementsPrintingEx {
	public static void main(String[] args) {
		ArrayList<Integer> obj1=new ArrayList();
		obj1.add(10);
		obj1.add(20);
		obj1.add(30);
		
		ArrayList <Integer> obj2=new ArrayList();
		obj2.add(11);
		obj2.add(22);
		obj2.add(33);
		
		
		ArrayList<ArrayList> obj=new ArrayList();
		obj.add(obj1);
		obj.add(obj2);
		
		System.out.println(obj);
		
		for(int i=0;i<obj.size();i++)
		{ 
			
			//name=obj.get(i).size();
			for(int j=0;j<obj.get(i).size();j++)
			{
				System.out.print(obj.get(i).get(j)+" ");
			}
		System.out.println();	
		}
	}

}
