package ListIteratorEx;

import java.util.ArrayList;
import java.util.Iterator;

public class MobileTesterUsingIterator {
	public static void main(String[] args) {
		ArrayList<Mobile> moblist=new ArrayList<>();
		moblist.add(new Mobile("Smart Phone","Samsung",10000));
		moblist.add(new Mobile("Keypad","Redmi",8000));
		moblist.add(new Mobile("Touch","Oppo",12000));
		
		System.out.println("The elements are: ");
		System.out.println(moblist);
		
		Iterator<Mobile> itr=moblist.iterator();
		System.out.println("Using while loop");
		while(itr.hasNext())
		{
			Mobile m=itr.next();
			if(m.getBrand().equalsIgnoreCase("oppo"))
			{
				itr.remove();
			}
		}
		
		System.out.println("After remove operation");
		System.out.println(moblist);
		}

}
