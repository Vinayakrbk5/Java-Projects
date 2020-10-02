package ListIteratorEx;

import java.util.ArrayList;
import java.util.ListIterator;

public class MobileTesterUsingListIteratorAddOperation {
	public static void main(String[] args) {
		ArrayList<Mobile> moblist=new ArrayList();
		moblist.add(new Mobile("Smart Phone","Samsung",10000));
		moblist.add(new Mobile("Keypad","Redmi",8000));
		moblist.add(new Mobile("Touch","Oppo",12000));
		Mobile obj1=new Mobile("Screen Touch","LG",25000);
		 
		System.out.println("The elements are: ");
		System.out.println(moblist);
		
		ListIterator<Mobile> listitr=moblist.listIterator();
		
		while(listitr.hasNext())
		{
			if(listitr.next().getPrice()==10000)  
			{
				listitr.add(new Mobile("Handset","Nokia",5000));  //  we can use more than one add statement
				listitr.add(obj1);
			}
		}
		System.out.println("Printing in reverse order");
		while(listitr.hasPrevious())
		{
			System.out.println(listitr.previous());
		}
		System.out.println("----------------------");
		System.out.println("After Add Operation");
		System.out.println(moblist);
	}
}
