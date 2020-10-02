package FunctionInterface_InbuiltInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.omg.Messaging.SyncScopeHelper;

public class InbuiltFunctionalInterface {
	public static void main(String[] args) {
		ArrayList<Employee> emp=new ArrayList<>();
		emp.add(new Employee("Vinayak",34));
		emp.add(new Employee("Basavaraj",65));
		emp.add(new Employee("Nikhil",23));
		emp.add(new Employee("Vishal",10));
		System.out.println(emp);
		
		Employee emp1=new Employee("Vinayak",25);
		System.out.println("Before setting name :"+emp1);
		emp1.setName("Vishal");
		System.out.println("After setting name :"+emp1);
		Predicate pd=new Predicate() {

			@Override
			public boolean test(Object obj) {
//				return "Vishal".equals(((Employee)obj).getName());
				return ((Employee)emp1).getName().equals("Vishal"); 
				 // here i have done external type casting and used anonymous class
			}
			
		};
		System.out.println("Predicate value is :"+pd.test(emp1));
		
		Predicate<Employee> pdl=(obj)->obj.getName().equals("Vishal");
		 // no type casting is required since we have mentioned type in beginning and used Lambda expression
		System.out.println("Both name are equal: "+pdl.test(emp1));
		
		Predicate<String> pr=(obj)->obj.equals("Vinayak");
		System.out.println(pr.test("Vinayak"));
		
		Predicate<Integer> print=(obj)->obj.equals(20);
		System.out.println("Two integers are equal :"+print.test(20));
		
		Function fn=new Function() {

			@Override
			public Object apply(Object obj) {
				return obj.equals(100);
			}
	};
	
	System.out.println(fn.apply(100));
	
	Consumer cn=new Consumer() {

		@Override
		public void accept(Object obj) {
			System.out.println("This is "+Double.parseDouble((String)obj));
		}
		
	};
	cn.accept("123.9866");
	
	Consumer cnr=(obj)->System.out.println("This is "+obj);
	cnr.accept(20);

	Supplier sup=new Supplier() {

		@Override
		public Object get() {  // return type may be of anything except void
			return 20;
			}
};
	System.out.println("Supplier Function :"+sup.get());
}
}