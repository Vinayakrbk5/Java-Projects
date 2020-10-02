package detailstester;

import jdbccrud.PersonalDetails;
import jdbccrudoperationimplementation.PersonalDetailsImpl;

public class PersonalDetailsTester {

	public static void main(String[] args) {
		PersonalDetails perdetails=new PersonalDetailsImpl();
		
		System.out.println("Table Contains the following Details");
		perdetails.displayAllRecords();
		System.out.println();
		
		perdetails.updateTable(7,"Srikanth","Solapur");
		System.out.println();
		
		
		perdetails.insertRecord(7, "Hemanth", "Chennai");
		System.out.println();
		
		perdetails.deleteRecord(1);
		System.out.println();
		
		System.out.println("Displaying the selected record");
		perdetails.displaySelectedRecord(2);
		
		

		
	}
}
