package Arrays;

import java.util.Scanner;

public class ToFindNOfSumArrayElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[] {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Enter the number");
		
		int num=scan.nextInt();
		int x=display(arr,num);
		if(x==0) {
			System.out.println("there is no matching number to the sum of array elements");
		}
		else {
		for(int i=0;i<=x;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		}
	}
	
	public static int display(int[] a,int n)
	{
		int sum=0,p=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			if(sum==n)
			{
				p=i;;
				break;
			}
		}
		return p;
	}
	
}
