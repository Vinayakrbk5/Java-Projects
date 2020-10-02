package DefaultModifierExapmle1;

public class FilmIndustry1 {
	String name;            // default modifier instance variable not visible in other packages

	FilmIndustry1(String name1, String name2) // default Modifier Constructor, this is not visible in other packages
	{
		System.out.println("Dr." + name1 + " is the famous actor in " + name2 + " Industry");
	}

	static void ind(int x)    //  default Modifier method(), not visible in other packages
	{
		System.out.println("Karnataka Population is : " + x + " crores");
	}

	public static void main(String[] args) {
		FilmIndustry1 sandal = new FilmIndustry1("Vishnuvardhan", "Kannada");
		ind(7);
		sandal.name = "Sandalwood";
		System.out.println("The Kannada film industry is named it as " + sandal.name);

	}

}
