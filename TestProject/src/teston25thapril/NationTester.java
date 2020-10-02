//	4).Create a map<String,CustomObject> containing unique key elements
//		a). Add 5 values to map
//		b). Sort them by their key elements

package teston25thapril;

import java.util.Set;
import java.util.TreeMap;

public class NationTester {
	public static void main(String[] args) {
		TreeMap<String, Nation> tmap = new TreeMap<>();
		
		tmap.put("Karnataka", new Nation(2, "India"));
		tmap.put("Maharastra", new Nation(6, "USA"));
		tmap.put("MP", new Nation(3, "Japan"));
		tmap.put("Kerala", new Nation(7, "France"));
		tmap.put("Gujarath", new Nation(4, "Itally"));

		Set<String> keysets = tmap.keySet();
		System.out.println("Nations Details is  :");
		for (String i : keysets) {

			System.out.println("Key is :["+i + "], value is :" + tmap.get(i));
		}

	}
}
