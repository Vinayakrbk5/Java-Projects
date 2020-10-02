package PracticalProgramsClass;

import java.util.Scanner;

public class ToFindArmstrongNumber {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scan.nextInt();
	int len=0,n=num,rem=0;;
	while(num!=0)
	{
		rem=num%10;
		len=len+1;
		num=num/10;
	}
	num=n;
	rem=0;
	int res=0;
	while(num!=0)
	{
		int sum=1;
		rem=num%10;
		for(int i=1;i<=len;i++)
		{
			sum=sum*rem;
		}
		num=num/10;
		res=res+sum;
	}
	if (res==n)
	{
		System.out.println("The given number is an armstrong number");
	}
	else
	{
		System.out.println("The given nmber is not an armstrong number");
	}
	
	}
}
