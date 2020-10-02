package teston25thapril;

import java.util.ArrayList;

public class CountryInformation {
	public static void main(String[] args) {
		ArrayList<ArrayList<ArrayList<String>>> list=new ArrayList<>();
		ArrayList<String> clist1=new ArrayList<>();
		ArrayList<String> clist2=new ArrayList<>();
		ArrayList<String> clist3=new ArrayList<>();
		ArrayList<State> slist=new ArrayList<>();
		ArrayList<Country> conlist1=new ArrayList<>();
		
		
		conlist1.add(new Country("Karnataka"));
		conlist1.add(new Country("Maharastra"));
		
		clist1.add("Bangalore");
		clist1.add("Mangalore");
		clist1.add("Dharwad");

		clist2.add("Pune");
		clist2.add("Mumbai");
		clist2.add("Nagpur");

		clist3.add("California");
	}
	
}

