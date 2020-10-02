// 1).What are the different ways to iterate over collections.Write an ArrayListof Character(eg: 'A','B' etc)
//  and illustrate all ways of iteration

package teston25thapril;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class CharacterArrayList {
	public static void main(String[] args) {
		ArrayList<Character> charr=new ArrayList<>();
		charr.add('B');
		charr.add('A');
		charr.add('G');
		charr.add('A');
		charr.add('L');
		charr.add('K');
		charr.add('O');
		charr.add('T');
		
		Iterator<Character> itr=charr.iterator();
		System.out.println("Characters using iterator is :");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		ListIterator<Character> litr=charr.listIterator();
		System.out.println("Characters using List Iterator is :");
		while(litr.hasNext())
		{
			System.out.print(litr.next()+" ");
		}
		
		System.out.println();
		System.out.println("Characters using for loop is :\"");
		for(int i=0;i<charr.size();i++)
		{
			System.out.print(charr.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("Characters using foreach loop is :\"");
		for(char c:charr)
		{
			System.out.print(c+" ");
		}
	}

}
