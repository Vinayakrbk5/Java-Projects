package ObjectClass;
import  Object_Of_Object.Mul;

public class ObjectClassAsReferenceVariable {
	public static Object getMethod(Object str)
	{
		if (str.equals("Maths"))
		{
			return new Maths();
		}
		else if (str.equals("Operation"))
		{
			return new Operation();
		}
		else if(str.equals("Mul"))  // Class Mul() is in different package 
		{							// so we have to import it otherwise it will throw complie time error
			return new Mul();
		}
		/*else if(str.equals("Vinayak"))  //  Class Vinayak() not present so it is throwing compile time error 
		{								  //  if it is there we have to import it before writing this 
			return new Vinayak();
		}*/
		
		else
			return null;
	}

	public static void main(String[] args) {  //  here Object is a super inbuilt class 
											  //  we are creating its  object as a reference to get an object of class we want
	Object obj1=getMethod("Maths");           //  it's class name is giving to match with class or not
	                                          //  if it matches then it will return it's object in hexadecimal format
	Object obj2=getMethod("Operation");
	Object obj3=getMethod("Mul");
	
	System.out.println(obj1);  // here class maths object is printing means printing hexadecimal 
	System.out.println(obj2);  // returning Operation class method
	System.out.println(obj3);  // returning null because class sound is in different package
	
	}

}
