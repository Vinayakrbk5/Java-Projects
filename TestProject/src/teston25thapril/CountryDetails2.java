package teston25thapril;

	import java.util.ArrayList;

	public class CountryDetails2 {
		public static void main(String[] args) {
			ArrayList<ArrayList<ArrayList<ArrayList<String>>>> arrlist = new ArrayList<>();
			ArrayList<ArrayList<ArrayList<String>>> India = new ArrayList<>();
			ArrayList<ArrayList<ArrayList<String>>> USA = new ArrayList<>();
			ArrayList<ArrayList<String>> Karnataka = new ArrayList<>();
			ArrayList<ArrayList<String>> Maharastra = new ArrayList<>();
			ArrayList<String> list1 = new ArrayList<>();
			ArrayList<String> list2 = new ArrayList<>();
			ArrayList<String> list3 = new ArrayList<>();
			
			

			list3.add("California");

			list1.add("Bangalore");
			list1.add("Mangalore");
			list1.add("Dharwad");

//			System.out.println(list1);

			list2.add("Pune");
			list2.add("Mumbai");
			list2.add("Nagpur");
//			System.out.println(list2);

			Karnataka.add(list1);
			Maharastra.add(list2);
//			System.out.println(state);

			India.add(Karnataka);
			India.add(Maharastra);
			
			arrlist.add(India);
			arrlist.add(USA);
			
			for(ArrayList<ArrayList<ArrayList<String>>> i:arrlist)
			{
				System.out.println(i);
				for(ArrayList<ArrayList<String>> j:i)
				{
					System.out.println(j);
					for(ArrayList<String> k:j)
					{
						System.out.println(k);
						for(String l:k)
						{
							System.out.println(l);
						}
					}
				}
				
			}
		}
	}
