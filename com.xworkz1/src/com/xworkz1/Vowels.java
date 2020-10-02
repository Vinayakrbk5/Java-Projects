package com.xworkz1;

public class Vowels {

	public static void main(String[] args) {
		char[] vowels= {'A','E','I','O','U'};
	System.out.println(vowels[0]);
	System.out.println(vowels[1]);
	System.out.println(vowels[2]);
	System.out.println(vowels[3]);
	System.out.println();
	
	System.out.println("--------------------");
	
	System.out.println();
	
	int length=vowels.length;
	System.out.println("The vowels are");
	for (int i=0;i<length;i++)
	{
		System.out.println(vowels[i]);
	}

	}

}
