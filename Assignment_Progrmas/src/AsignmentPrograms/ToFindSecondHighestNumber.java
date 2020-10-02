package AsignmentPrograms;

import java.util.Scanner;

public class ToFindSecondHighestNumber {
	
	public  static int[] findsecondhighest(int[] a)
	{
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter the lenth of the array");
	int n=scan.nextInt();
	int arr[]=new int[n];
	int[] newarr=new int[arr.length];
	System.out.println("enter the elements of the array");
	for(int i=0;i<n;i++)
	{
		arr[i]=scan.nextInt();
	}
	System.out.println("array elements are :");
	for(int j:arr)
	{
		System.out.print(j+" ");
	}
	System.out.println();
	newarr=findsecondhighest(arr);
	System.out.println("sorted elements are :");
	for(int p:newarr)
	{
		System.out.print(p+" ");
	}
	System.out.println();
	System.out.println("second highest elements in the array is :"+newarr[newarr.length-2]);
	}

}
