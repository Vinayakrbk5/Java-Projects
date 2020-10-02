package AsignmentPrograms;

import java.util.Scanner;

public class ToFindPalindromeNumber {
	public static int palindrome(int a)
	{
		int q=0;
		int s=a;
		while(a!=0)
		{
			a=a/10;
			q=q+1;
		}
		int x[]=new int[q];
		int y[]=new int[q];
		int j=0;
		int p=y.length-1;
		int val=0;
		int r=0;
		while(s!=0)
		{
			r=s%10;
			y[p]=r;
			x[j]=r;
			System.out.println("x  and y value are  :"+r+" & "+r);
			p=p-1;
			j=j+1;
			s=s/10;
		}
		for(int i=0;i<x.length;i++)
		{
			if(x[i]!=y[i])
			{
				val=1;
				break;
			}
		}
		return val;
	}

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter the number to find palindrome or not");
	int num=scan.nextInt();
	int y=palindrome(num);
	if (y==1)
	{
		System.out.println("The given number "+num+" is not a palindrome");
	}
	else
	{
		System.out.println("The given number "+num+" is a palindrome number");
	}
 }
}	
