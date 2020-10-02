package DefaultModifierExapmle2;

import DefaultModifierExapmle1.FilmIndustry1;

public class FilmIndustry2 {

	public static void main(String[] args)
	{
		FilmIndustry1 bolly=new FilmIndustry1("Mr.Amithab Bachhan","Boolywood");  // FilmIndustry1() is a default class constructor 
			ind(8);  //  not visible in this package because default modifier not visible in any other packages	
			bolly.name="Bollywood";  //  name is not visible because name is default modifier instance variable 
									 //  not visible in any other packages
	}

}
