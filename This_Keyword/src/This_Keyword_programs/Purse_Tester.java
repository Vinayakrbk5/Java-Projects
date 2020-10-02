package This_Keyword_programs;

public class Purse_Tester {

	public static void main(String[] args) {
	Purse purse=new Purse();
	purse.Display().nation();
	
	Purse display=purse.Display();  //  this is another way of writing above one
	display.nation();
	display.color="Yellow";
	System.out.println("Color is : "+display.color);
	   
	}

}
