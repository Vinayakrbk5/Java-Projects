package ArrayListEx;

import java.util.ArrayList;

public class ArrayListType {
	public static void main(String[] args) {
		ArrayList<Integer> IntList=new ArrayList();
		IntList.add(10);
		System.out.println(IntList);
		IntList.remove(new Integer(10));
		System.out.println(IntList);
		System.out.println(IntList.getClass());
	}

}
