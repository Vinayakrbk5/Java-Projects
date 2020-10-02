package Programs;

import java.util.Scanner;

public class ToFindPrimeNo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=scan.nextInt();
		int p=primeNo(n);
		if(p==0)
		{
			System.out.println("The given no is a prime no");
		}
		else
		{
			System.out.println("The given no is not a prime no");
		}
		
	}
	public static  int primeNo(int n)
	{
		int s=0;
		for(int i=2;i<n/2;i++)
		{
			if ((n%i)==0)
			{
				s=1;
				break;
			}
		}
		return s;
	}

}
