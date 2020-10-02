package Iterator;

import java.util.Arrays;

public class OperationOnPremitiveTypeElements {
	public static void main(String[] args) {
		int[] arr=new int[]{4,3,9,6,2,5};
		String[] name=new String[] {"Vinayak","Sharath","Vishal","Basavaraj"};
		char[] ch=new char[] {'D','P','A','S','M'};
		System.out.println("Before sorting an array elements");
		System.out.print("[");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
		
		Arrays.sort(arr);
		System.out.println("after sorting an array elements");
		System.out.print("[");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
		System.out.println("----------------------------");
		
		System.out.println("Before sorting names");
		System.out.print("[");
		for(String i:name)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
		
		Arrays.sort(name);
		System.out.println("after sorting names");
		System.out.print("[");
		for(String i:name)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
		System.out.println("--------------------------------");
		System.out.println("Before sorting charecters are");
		System.out.print("[");
		for(char i:ch)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
		
		Arrays.sort(ch);
		System.out.println("after sorting charecters are");
		System.out.print("[");
		for(char i:ch)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
	}

}
