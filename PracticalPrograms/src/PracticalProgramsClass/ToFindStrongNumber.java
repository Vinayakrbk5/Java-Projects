package PracticalProgramsClass;

import java.util.Scanner;

public class ToFindStrongNumber {
	public int Fact(int n)
	{
		if( (n==1)||(n==0))
		{
			return 1;
		}
		else
		{
			return n*Fact(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int num=Integer.Nextint
		ToFindStrongNumber obj=new ToFindStrongNumber();
		System.out.println("enter th no");
		int n=scan.nextInt();
		int num=n;
		int rem=0,sum=0;
		int res;
		while(num!=0)
		{
			rem=num%10;
			/*res=1;
			for(int i=1;i<=rem;i++)
			{
				res*=i;
			}
			sum+=res;
			num/=10;
		}*/
			sum=sum+obj.Fact(rem);
		if(sum==n)
		{
			System.out.println("The given number is strong number");
		}
		else
		{
			System.out.println("The given number is not a strong number");
		}
	}

	}
}
