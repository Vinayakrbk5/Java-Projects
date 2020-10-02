package ListIteratorEx;

import java.util.ArrayList;
import java.util.ListIterator;

public class MobileTesterUsingListIteratorUsingPrevious {
	public static void main(String[] args) {
		ArrayList<Mobile> moblist = new ArrayList();
		moblist.add(new Mobile("Smart Phone", "Samsung", 10000));
		moblist.add(new Mobile("Keypad", "Redmi", 8000));
		moblist.add(new Mobile("Touch", "Oppo", 12000));
		Mobile obj1 = new Mobile("Screen Touch", "LG", 25000);

		System.out.println("The elements are: ");
		System.out.println(moblist);
		System.out.println("-----------------------------");

		ListIterator<Mobile> listitr = moblist.listIterator();
		for(Mobile i:moblist)
		{
		System.out.println(listitr.next());
		}
		while (listitr.hasPrevious()) {
			if (listitr.previous().getBrand().equals("Oppo")) {
				listitr.remove(); // we cannot use remove() and set() at a time
//				listitr.set(obj1);
//				listitr.add((new Mobile("Handset","Nokia",5000)));

			}
		}
		System.out.println("-------------------------------");
		System.out.println("After Add Operation");
		System.out.println(moblist);
	}

}
