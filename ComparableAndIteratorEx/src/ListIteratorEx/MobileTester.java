package ListIteratorEx;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class MobileTester {

	public static void main(String[] args) {
		ArrayList<Mobile> moblist=new ArrayList<>(); 
		Mobile mob1=new Mobile("Smart Phone", "Samsung",10000);
		Mobile mob2=new Mobile("Keypad", "Redmi",8000);
		Mobile mob3=new Mobile("Touch", "Oppo",12000);
		
		moblist.add(mob1);
		moblist.add(mob2);
		moblist.add(mob3);
		System.out.println("The elements are: ");
		System.out.println(moblist);
		try {
		for(Mobile i:moblist)
		{
			if(i.getPrice()==8000)
				moblist.remove(i);
		}
		}
		catch(ConcurrentModificationException e)
		{
			System.out.println();
			System.out.println("This is ConcurrentModificationException Exception");
		}
		
		System.out.println();
		System.out.println("After remove Operation");
		for(Mobile i:moblist)
		{
			System.out.println(i);
		}
	}
}
