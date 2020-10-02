package AsignmentPrograms;

import java.util.Scanner;

public class ToFindArmstrongOfArray {
	public static int Armstrong(int a)
	{
		int p=0,i=0,mul=0,sum;
		int s=a;
		while(a!=0)
		{
			a=a/10;
			p++;
		}
		while(s!=0)
		{
			sum=1;
			i=s%10;
			for (int j=0;j<p;j++)
			{
				sum=sum*i;
			}
			mul=mul+sum;
		 s=s/10;
		}
		return mul;
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the length of the array");
	int len=scan.nextInt();
	int arr[]=new int[len];
	int newarr[]=new int[arr.length];
	System.out.println("Enter the array elements ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		int n=Armstrong(arr[i]);
		System.out.println(n);
		if(arr[i]==n)
		{
			System.out.println("The array element "+arr[i]+" is an Armstrong number");
		}
		else
		{
			System.out.println("The array element "+arr[i]+" is not an Armstrong number");
		}
	}
	}

}
