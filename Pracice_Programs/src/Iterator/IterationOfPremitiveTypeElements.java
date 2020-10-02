package Iterator;

//  iteration of premitive type is not possible 

import java.util.Iterator;

public class IterationOfPremitiveTypeElements {
	public static void main(String[] args) {
		int[] arr=new int[]{4,3,9,6,2,5};
		String[] name=new String[] {"Vinayak","Sharath","Vishal","Basavaraj"};
		System.out.println("an array elements");
		System.out.print("[");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
	}
	
}
