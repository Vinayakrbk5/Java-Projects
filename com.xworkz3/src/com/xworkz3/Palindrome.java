package com.xworkz3;

public class Palindrome {

	public static void main(String[] args) {
		int num=12345;
		 int res=num;
		 int p=0,q=0;
		 int sum=0;
		while(num!=0)
		{
		p=(num%10);
	    sum=sum*10+p;
		num=num/10;
		}
		num=res;
		System.out.println("The initial value of num is :"+num);
		System.out.println("The value of num after operation is : "+sum);
		if (num==sum)
		{
			System.out.println("The given number is a Palindrome");
		}
		else{
			System.out.println("The given number is not a palindrome");
		}
	}

}
