package AsignmentPrograms;

import java.util.Scanner;

public class ToFindFibonacci {
	
	public static int fibonacci(int a)
	{
		if(a==0)
			{
			return 0;
			}
			else if(a==1)
			{
				return 1;
			}
		else
		{
			return(fibonacci(a-1)+fibonacci(a-2));
		}
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number to find fibonacci");
	int num=scan.nextInt();
	int x=fibonacci(num);
	//System.out.println(num);
	System.out.println("fibonacci series of "+num+" is :"+x);
	}

}
