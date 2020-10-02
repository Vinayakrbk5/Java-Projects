package Polymorphism;
//import PolymorphismPrograms.Vishnu;
public class ParentTester  {

	public static void main(String[] args) {
		ChildClass2 child2=new ChildClass2("India");
		child2.name="Vinayak";
		child2.display();
		//Vishnu vish=new Vishnu();
		//vish.Avathar();     //  this is possible when we are not inherited, means using object of inherited class we can call Avathar() method 
		//ParentTester test=new ParentTester();
		//test.Avathar();     //  this is possible when we are inherited, means using object of current class we can call Avathar() Method
		System.out.println("=================================");
		child2.x=10;
		child2.y=23.67;
		child2.cityname();
		child2.display();
		child2.yname();
		child2.numvalue();
		System.out.println("=========================================");
		
		ChildClass1 child1=new ChildClass2("XWorkz");
		//child1.name="Yash";
		//child1.display();
		
}
}
