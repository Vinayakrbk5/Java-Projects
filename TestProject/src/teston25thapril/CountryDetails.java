//  6). write a program that  can contain the list of countries their respective states
//		and list of cities within states

package teston25thapril;

import java.util.ArrayList;

public class CountryDetails {
	public static void main(String[] args) {
		ArrayList<ArrayList<Country>> arrlist = new ArrayList<>();
		ArrayList<Country> country = new ArrayList<>();
		ArrayList<State> state = new ArrayList<>();
		ArrayList<String> city1 = new ArrayList<>();
		ArrayList<String> city2 = new ArrayList<>();
		ArrayList<String> city3 = new ArrayList<>();

		city1.add("Bangalore");
		city1.add("Mangalore");
		city1.add("Dharwad");

		city2.add("Pune");
		city2.add("Mumbai");
		city2.add("Nagpur");

		city3.add("California");

		state.add(new State("Karnataka"));
		state.add(new State("Maharastra"));

		Country c1 = new Country("India");
		Country c2 = new Country("USA");

		country.add(c1);
		country.add(c2);

		arrlist.add(country);
		for (int j = 0; j < country.size(); j++) {
			System.out.println("1)." + country.get(j));

			for (int i = 0; i < state.size(); i++) {

				System.out.println("      " + state.get(i));

				for (String s1 : city1) {
					System.out.println("          " + s1);
				}

				i++;

				System.out.println();
				System.out.println("      " + state.get(i));

				for (String s2 : city2) {
					System.out.println("          " + s2);
				}
//				break;
			}
			j++;

			System.out.println();
			System.out.println();

			System.out.println("2)." + country.get(j));
			{
				for (int i = 0; i < city3.size(); i++) {
					System.out.println("      " + city3.get(i));
				}
			}
		}
	}
}
