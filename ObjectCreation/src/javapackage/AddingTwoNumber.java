package javapackage;

import java.util.Scanner;

public  class AddingTwoNumber {
	
	public static void print()
	{
		System.out.println("The program is to print two Integer numbers");	
	}
	public static int add(int a, int b)
	{
		return a+b;
	}
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);       //defined Scanner to take input from the user
		System.out.println("Enter the values of an and b: ");
		int a=scan.nextInt();						//taking value of a
		int b=scan.nextInt();						//taking value of b
		AddingTwoNumber obj=new AddingTwoNumber();  //creating an Object or Instance of the class
      //int a=30,b=40;
      obj.print();									//calling function print() from the class using Object obj
      System.out.println("The addition of "+a+" and "+b+" is : "+ obj.add(a,b));   //calling function add() from the class  
      																			   //using Object obj
	}

}
