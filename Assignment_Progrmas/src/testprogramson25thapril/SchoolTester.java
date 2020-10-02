package testprogramson25thapril;

//import java.time.format.ResolverStyle;
//import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SchoolTester {
	public static void main(String[] args) {
		LinkedHashSet<School> lset=new LinkedHashSet<>( );//new Comparator<School>(){

//			@Override
//			public int compare(School obj1, School obj2) {
//				return obj1.getFees().compareTo(obj2.getFees());
//			}
//		});	
		
//		LinkedHashSet<School> lset=new LinkedHashSet<>();
		
		lset.add(new School(2,"Vinayak",67564,35000.00));
		lset.add(new School(5,"Vishal",876543,20000.00));
		lset.add(new School(1,"Sharath",987123,56000.00));
		lset.add(new School(4,"Basavaraj",563241,25000.00));
		
		System.out.println("Elements before sorting");
		for(School s:lset)
		{
			System.out.println(s);
		}
		TreeSet<School> tset=new TreeSet<>(); // new Comparator<School>() {
//
//			@Override
//			public int compare(School o1, School o2) {
////				School s1=(School)o1;
////				School s2=(School)o2;
//				return o1.getFees().compareTo(o2.getFees());
//			}
//			
//		});
		tset.addAll(lset);
//		Comparator<School> cr=new Comparator<School>() {
//
//			@Override
//			public int compare(School o1, School o2) {
//				return o1.getFees().compareTo(o2.getFees());
//			}
//			
//		};
		
//		Collections.sort(lset,Collections.reverseOrder());
//		
		System.out.println("TreeSet Elements");
		for(School s:tset)
		{
			System.out.println(s);
		}
		
		
	}

}
