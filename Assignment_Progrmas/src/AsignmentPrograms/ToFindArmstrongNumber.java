package AsignmentPrograms;

import java.util.Scanner;

public class ToFindArmstrongNumber {
	
	public static int TofindArmstrong(int a)
	{
		int arr[]=new int[3];
		int sum=0,i=0;
		while(a!=0)
		{
			i=a%10;
			sum=sum+i*i*i;
			a=a/10;
		}
		return sum;
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the 3 digit number");
	int num=scan.nextInt();
	int newnum=TofindArmstrong(num);
	if (num==newnum)
	{
		System.out.println("The given number "+num+" is an armstrong number");
	}
	else
	{
		System.out.println("The given number "+num+" is not an armstrong number");
	}
	}

}
