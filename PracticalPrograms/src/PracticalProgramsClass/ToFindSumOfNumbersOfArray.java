package PracticalProgramsClass;

import java.util.Scanner;

public class ToFindSumOfNumbersOfArray {

	public static void main(String[] args) {
	int[] a= {1,5,3,4,7,6,-1,2,5,9,8,0};
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number to find sum");
	int n=scan.nextInt();
	//int count=0;
	for(int i=0;i<a.length;i++)
	{
		//count=0;
		display(i,n,a);
	}
//	if(a[a.length-1]==0)
//	{
//		display2(a,n);
//	}
	}
	public static void display(int i,int n,int[] a) {
		int sum=0;
		//int count=0;
		for(int p=i;p<a.length;p++)
		{
		sum=sum+a[p];
		//count++;
		if(sum==n)
		{
			System.out.print("{ ");
			for(int j=i;j<=p;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println("}");
			break;
		}
	}
	}
//	public static void display2(int[] n,int num ) {
//	int arr[]=new int[n.length];
//	int sum=0 ,count=0;
//	for (int i=0,j=arr.length-1;i<arr.length;i++,j--)
//	{
//		n[i]=arr[j];
//	}
//	for(int i=0;i<arr.length;i++)
//	{
//		sum=sum+arr[i];
//		count++;
//		if (sum==num)
//		{
//			System.out.println("{ ");
//			for(int j=count;j>=0;j--)
//			{
//				System.out.println(arr[j]+" ");
//			}
//			System.out.println("}");
//			break;
//		}
//	}
//	}
}
