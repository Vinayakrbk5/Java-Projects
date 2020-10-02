package TravelChild1;

import Travel.TravelClass;

public class Airways extends TravelClass {
	String airlines;
	void displayairlines()
	{
		System.out.println("Airlines is :"+airlines);
	}
	
public static void main(String[] args) {
	Airways aw=new Airways();
	aw.type="Airlines";
	aw.journeytype();
	aw.displayairlines();
}
}
