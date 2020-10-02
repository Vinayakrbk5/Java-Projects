package Programs;

import java.util.Scanner;

public class ToFindArmstrongNo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no");
		int x=scan.nextInt();
		Arm(x);		
	}
	public static void Arm(int n)
	{
		int count=0,sum=1,s=0,res=0,num=0;
		num=n;
		while(n!=0)
		{
			s=n%10;
			count++;
			n=n/10;
		}
		int arr[]=new int[count];
		for(int j=0;j<count;j++)
		{
		for(int i=0;i<count;i++)
		{
			sum=sum*arr[i];
		}
		res=res+sum;
		}
		if(res==num)
		{
			System.out.println("the number is alindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}

}
