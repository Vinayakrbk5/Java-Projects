package Swapping;

import java.util.Scanner;

public class FindingPrimeNumber {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.println("Enter the number :");
		a=scan.nextInt();
		int i=2;
		int x=0;
		int temp=a/2;
		while(i<=temp)
		{
			if ((a%i)==0)
			{
				x=1;
				break;
			}
			
			i++;
		}
		if(x==1) {
			System.out.println("The given number "+a+" is not a prime number");
		}
		else
		{
			System.out.println("The given number "+a+" is a prime number");
		}
	}

}
