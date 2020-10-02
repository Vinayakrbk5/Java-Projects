package ArrayListEx;

import java.util.ArrayList;

public class CountryListInsideList {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> cList=new ArrayList<>();
		
		ArrayList<String> List1=new ArrayList();
		List1.add("Kar");
		List1.add("AP");
		List1.add("MP");
		System.out.println(List1);
		
		ArrayList<String> List2=new ArrayList();
		List2.add("Naga");
		List2.add("Bharana");
		List2.add("Sahiti");
		System.out.println(List2);
		cList.add(List1);
		cList.add(List2);
		System.out.println(cList);
		System.out.println();
	}

}
