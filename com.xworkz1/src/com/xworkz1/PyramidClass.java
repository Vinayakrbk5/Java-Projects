package com.xworkz1;

public class PyramidClass {
	public static void main(String arg[])
	{
	/*
	*
	**
	***
	*****/
	int i=0;
	int j=0;
	while(i<=5)
	{
		j=0;
		while(j<=i)
		{
		System.out.print("* ");
		j++;
	}
	System.out.println();
	i++;
}
	i=4;
	j=0;
	while(i>=0)
	{
		j=0;
		while(j<=i)
		{
			System.out.print("* ");
			j++;
		}
		i--;
		System.out.println();
	}
	
}
}
