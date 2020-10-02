package com.xworkz;

public class operators {

	public static void main(String[] args) {
		// Arithmatic operators: +, -, *, /, %
		int a=10,b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//Relational operators: <, >, <=, >=, ==, !=
		if(a<b)
		{
			System.out.println("a is less than b");
		}
		else if(a>b)
		{
			System.out.println("a is greater than b");
		}
		else if(a<=b)
		{
			System.out.println("a is less than or equal to b");
		}
		else if(a>=b)
		{
			System.out.println("a is greater than or equal to b");
		}
		else if(a==b)
		{
			System.out.println("a is equal to b");
		}
		else
		{
			System.out.println("a is not equal to b");
		}

		 //logical operators: |, &, ~
		if((a>b)&&(a!=b))
		{
			System.out.println("i am learning java in X-workz");
		}
		else if((~a)==-11)//doubt
		{
			System.out.println("i am not learning java in X-workz");
		}
		
		//Ternary operators
		int result;
		result=(a>b)?a:b;
		System.out.println("values of result is "+result);
		System.out.println((~a));
	}
}
