package com.xworkz1;

public class adding_num {

	public static void main(String[] args) 
	{
		int[] nums;//declaration
		nums=new int[6];//initialization
		
	System.out.println("The program to illustrate the array");
	nums[0]=10;
	//initial value for all numeric data types will be by 0
	System.out.println("The first number is "+nums[0]);
	nums[1]=11;
	System.out.println("The second number is "+nums[1]);
	System.out.println("The Third number is "+nums[3]);//not initialized value so it prints by default zero
	}

}
