package hasSetExamples;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorInHasSet {
	public static void main(String[] args) {
		HashSet<String> Sset=new HashSet<>();
		Sset.add("Vinayak");
		Sset.add("Savithri");
		Sset.add("Bharath");
		Sset.add("Chinmaye");
		Sset.add("Nikhil");
		System.out.println("String array is :"+Sset); // hasset will print its elements in random order
	    
		Iterator<String> itr=Sset.iterator();
		System.out.println("Using Iterator");
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+"  ");
//		}
//		System.out.println();
		while(itr.hasNext())
		{
			if(itr.next().equals("Vinayak"))
			{
				itr.remove();
			}
		}
		System.out.println(Sset);
	}

}
