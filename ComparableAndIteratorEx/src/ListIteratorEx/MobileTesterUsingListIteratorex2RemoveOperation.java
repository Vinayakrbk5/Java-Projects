package ListIteratorEx;

import java.util.ArrayList;
import java.util.ListIterator;

public class MobileTesterUsingListIteratorex2RemoveOperation {
	public static void main(String[] args) {
		ArrayList<Mobile> moblist=new ArrayList();
		moblist.add(new Mobile("Smart Phone","Samsung",10000));
		moblist.add(new Mobile("Keypad","Redmi",8000));
		moblist.add(new Mobile("Touch","Oppo",12000));
		 
		System.out.println("The elements are: ");
		System.out.println(moblist);
		
//		it1.forEachRemaining(System.out::println);
//		ListIterator<Mobile> listitr=moblist.listIterator();
		System.out.println("_ _ _Using for loop_ _ _");
		for(ListIterator<Mobile> listitr=moblist.listIterator();listitr.hasNext();)
		{
//			System.out.println(listitr.next());
			if(listitr.next().getType().equals("Smart Phone"))
			{
				listitr.remove();  // we can use only one remove() method at a time
			}
		}
		System.out.println("After remove Opeartion");
		System.out.println(moblist);
	}

}
