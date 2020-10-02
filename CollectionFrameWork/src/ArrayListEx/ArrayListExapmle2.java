package ArrayListEx;

import java.util.ArrayList;

public class ArrayListExapmle2 {
	public static void main(String[] args) {
		ArrayList<String> monthList=new ArrayList<>();
		monthList.add("Jan");
		monthList.add("Feb");
		monthList.add("Mar");
		System.out.println(monthList);
		
		ArrayList QuarterMonth=new ArrayList();
		QuarterMonth.add("JUl");
		QuarterMonth.add("Aug");
		QuarterMonth.add("Sep");
		System.out.println(QuarterMonth);
		
		monthList.addAll(QuarterMonth);    // adding all elements of object  QuarterMonth
		System.out.println(monthList);
		monthList.remove(3);              //  removing 4th position element
		System.out.println(monthList);
		
		monthList.remove("Jan");          //  removing Jan element from the list
		System.out.println(monthList);
		monthList.removeAll(QuarterMonth);   //   removing all elements of the list QuarterMonth
		System.out.println(monthList); 
		System.out.println("=================================");
		System.out.println(monthList.contains("Feb"));    //  returns true if the given element is there in the list 
		System.out.println(monthList.isEmpty());          //  checks if list is empty or not
		System.out.println(monthList.get(1));
		System.out.println(monthList.set(1, "Dec"));      // sets the given position to the given elements
		System.out.println(monthList);
		
		
		System.out.println(monthList.equals(QuarterMonth));
		
		
		
	}

}
