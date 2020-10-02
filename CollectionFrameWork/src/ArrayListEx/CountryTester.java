package ArrayListEx;

import java.util.ArrayList;

public class CountryTester {
	public static void main(String[] args) {
		ArrayList<Country> cDetails=new ArrayList();
		Country india=new Country("India",91,30);
		Country usa=new Country("USA",22,25);
		cDetails.add(india);
		cDetails.add(usa);
		
		System.out.println(cDetails);
		System.out.println("===================================");
		
		for( int i=0;i<cDetails.size();i++)
		{
			System.out.println(cDetails.get(i));
		}
		System.out.println("-----------------------------------");
		for(Country i:cDetails)
		{
			System.out.println(i);
		}
		
	}

}
