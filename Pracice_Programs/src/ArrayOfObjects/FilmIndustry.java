package ArrayOfObjects;

public class FilmIndustry {
	private String industryname;
	private String famousactor;
	//int income;

	FilmIndustry(String industryname, String famousactor )
	{
		this.famousactor=famousactor;
		this.industryname=industryname;
	}
	

	public String getIndustryname() {     // used only get method()
		return industryname;
	}

	/*public void setIndustryname(String industryname) {
		this.industryname = industryname;
	}*/

	public String getFamousactor() {   //  used only get method()
		return famousactor;
	}

	/*public void setFamousactor(String famousactor) {
		this.famousactor = famousactor;
	}*/

	

	public static void main(String[] args) {
		
		FilmIndustry sandalwood=new FilmIndustry("Sandalwood","Dr.VishnuVardhan");  // values are set here so not used set method()
		FilmIndustry bollywood=new FilmIndustry("BollyWood","Mr.Amithab Bachhan");  // values are set here so not used set method()
		FilmIndustry tollywood=new FilmIndustry("TollyWood","Mr.Chiranjeevi");      // values are set here so not used set method()
		
		FilmIndustry[] arr =new FilmIndustry[3];      // declaring an array of type class FilmIndustry
		FilmIndustry[] newarr=new FilmIndustry[arr.length]; // declaring an another array of type class FilmIndustry
		arr[0]=sandalwood;
		arr[1]=bollywood;
		arr[2]=tollywood;
		
		newarr=arr;          // copying elements from one array to another array
		
		System.out.println("printing directly");     // printing elements of an array named arr[]
		System.out.println(arr[0].famousactor+" is the famous Actor in the "+arr[0].industryname+" film Industry"); // used arr[0] to print
		System.out.println(arr[1].famousactor+" is the famous Actor in the "+arr[1].industryname+" film Industry"); // used arr[1] to print
		System.out.println(arr[2].famousactor+" is the famous actor in the "+arr[2].industryname+" film Industry"); // used arr[2] to print
		System.out.println("_________________________________________");
		System.out.println();
		
		System.out.println("printing using for loop");    // printing elements of an array named newarr[]
		for(FilmIndustry c:newarr)							
		{
			System.out.println(c.famousactor+" is the famous Actor in the "+c.industryname+" film Industry");

		}
		
	}

}
