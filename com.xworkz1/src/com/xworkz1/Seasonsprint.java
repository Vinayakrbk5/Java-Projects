package com.xworkz1;

public class Seasonsprint {

	public static void main(String[] args) {
		System.out.println("The program to display the seasons");
	String[] seasons;
	seasons=new String[10];//10 memory locations are stored 
	seasons[0]="summer";
	seasons[0]="winter";
	seasons[0]="rainy";
	seasons[0]="spring";
	System.out.println("__________________");//but only four memory locations are used
	
	System.out.println();
	String FourSeasons[]= {"summer","Rainy","winter","spring"};//by default it stores only four memory locations
	System.out.println(FourSeasons[0]);
	System.out.println(FourSeasons[1]);
	System.out.println(FourSeasons[2]);
	System.out.println(FourSeasons[3]);
	//System.out.println(FourSeasons[3]);//run time error that array index out of bound error
			}

}
