package DerivedTypeCasting;

public class ParentTester {

	public static void main(String[] args) {
		ChildClass2 child2 = new ChildClass2("Vinayak");  // object defined
		child2.display();

		System.out.println("value of f from childclass1 :" + child2.f);
		System.out.println("Value of x from parent class :"+ child2.x);
		System.out.println("------------------------------------");

		ChildClass1 childcls1 = (ChildClass1) new ChildClass2();  // object typecasted
//						or	 (ChildClass1) child2;
//						or	 new ChildClass2();
//						or	 child2;				 all are acceptable
		ChildClass1 child1=new ChildClass1(); // obect defined
		child1.display();
		System.out.println("value of f from it's own class : "+child1.f);
		System.out.println("Value of x from parent class :"+child1.x);
		System.out.println(childcls1.f);
		System.out.println("-----------------------------------------");
		
		childcls1.display();
		System.out.println("========================================");
		
		ParentClass parent=new ParentClass();  //object defined
		parent.display();
		System.out.println("value of x from it's own class :"+parent.x);
		
		System.out.println("--------------------------------------");
		
		ParentClass parent1=child1;  //  object typecasted
		parent1.display();
		System.out.println("value of x :"+parent1.x);
		
	}

}
