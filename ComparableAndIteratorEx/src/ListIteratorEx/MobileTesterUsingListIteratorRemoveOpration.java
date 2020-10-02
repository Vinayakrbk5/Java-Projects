package ListIteratorEx;

import java.util.ArrayList;
import java.util.ListIterator;

public class MobileTesterUsingListIteratorRemoveOpration {
	public static void main(String[] args) {
		ArrayList<Mobile> moblist=new ArrayList();
		moblist.add(new Mobile("Smart Phone","Samsung",10000));
		moblist.add(new Mobile("Keypad","Redmi",8000));
		moblist.add(new Mobile("Touch","Oppo",12000));
		 
		System.out.println("The elements are: ");
		System.out.println(moblist);
		
		ListIterator<Mobile> listitr=moblist.listIterator();
		System.out.println("_ _ _Using do while loop_ _ _");
		do
		{
			if(listitr.next().getType().equals("Touch"))
				listitr.remove();
		}while(listitr.hasNext());
		
		
		System.out.println("Aftre remove Operation");
		System.out.println(moblist);
		
	}

}
