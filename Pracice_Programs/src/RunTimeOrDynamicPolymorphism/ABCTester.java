package RunTimeOrDynamicPolymorphism;

public class ABCTester {

	public static void main(String[] args) {
	C c=new C();   				  //  object defined
	System.out.println(c.x);
	c.display();     			  //  calling it's own method
	System.out.println("=========================================================");
	
	B b=new B();     				//  object defined       
	System.out.println(b.x);
	b.display();					//  calling it's own method
	System.out.println("----------------------------------");
	
	B bc=new C();                   //  Object TypeCasted
	System.out.println(bc.x);
	bc.display();					//  calling child class C() overridden method by parent class B() object
	System.out.println("=========================================================");
	
	A a=new A();					//  Object defined
	System.out.println(a.x);
	a.display();					//  calling it's own method
	System.out.println("-----------------------------------");
	
	A ab=new B();					//  Object TypeCasted
	System.out.println(ab.x);
	ab.display();					// calling child class B() overridden method by parent class A() Object 
	System.out.println("-----------------------------------");
	
	A ac=new C();					//  Object TypeCasted
	System.out.println(ac.x);
	ac.display();					//  calling child class C() overridden method by parent class A() Object 
	System.out.println("=========================================================");

//	B ba =(B)new A();          we cannot convert parent class object to child class object it will not throw compile time error
//							   but will throw Run time error of below one.so up casting is possible but down casting is not possible
//	System.out.println(ba.x);  Run time error that RunTimeOrDynamicPolymorphism.A cannot be cast to RunTimeOrDynamicPolymorphism.B
//	ba.display();			   Run time error that RunTimeOrDynamicPolymorphism.A cannot be cast to RunTimeOrDynamicPolymorphism.B
	
	}

}
