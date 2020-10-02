//  this and super keywords are used any number of times for accessing instance variables and methods 
//but used only one at  a time for calling constructors
//  and we can use we can access data members and methods any number of times along with constructor calling 
//  in that constructor has to be called only once using either super or this keyword
// and in that constructor calling statement must be the first statement

package SuperKeywordExample;

public class ChildClass1 extends ParentClass
{
	int y;
	
	ChildClass1()
	{
		super.a=20;  // one time
		super.b=45;  // second time 
		super.display();  // third time
		this.a=30;;    // one time
		this.display();  //second time
		//System.out.println(a);
		System.out.println(b);
		System.out.println("This is child class");
	}
	ChildClass1(int age)
	{
		super("Shashi");  // but this must be at once
		super.a=100;
		System.out.println("My age is :"+age);
	}
	
}
