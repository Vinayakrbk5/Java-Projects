package PracticalProgramsClass;

import java.util.Scanner;

public class SumOfDigitsDEvidesByNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int rem=0,sum=0;
		int n=num;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		if (num%sum==0)
		{
			System.out.println("The given devided by it's sum of digits");
		}
		else
		{
			System.out.println("The given not devided by it's sum of digits");
		}
		}

}
