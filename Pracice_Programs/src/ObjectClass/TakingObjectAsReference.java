// 1) here we have used object class to return it's object when it matches with the given name
// 2) toString() method is overridden by creating another class ObjectClassParent
// 3) equals() method is overridden by creating another class ObjectClassChild1
// 4) hashCode() method is overridden by creating another class ObjectClassChild1
//   above all are used in single program
package ObjectClass;

public class TakingObjectAsReference {

	public static void main(String[] args) {
	Object obj=getObject("ObjectClassParent");          //  creating reference Object
	System.out.println(obj);        			 	    //  printing toString () method indirectly
	ObjectClassChild1 child1=new ObjectClassChild1();   //  creating child1 object of the class ObjectClassChild1()
	ObjectClassChild1 child11=new ObjectClassChild1();  //  creating child1s1 object of the class ObjectClassChild1()
	child1.city="Bangalore";							//  assigning value to city using object child1
	child1.name="Raju";									//  assigning value to name using object child1
	child11.city="Bangalore";							//  assigning value to city using object child11
	child11.name="Sachin";								//  assigning value to city using object child11
	System.out.println(child1.toString());   			//  printing toString() method value returned by ObjectClassPerent
	
	child1.id=23;										//  assigning value to id
	System.out.println(child1.hashCode()); 				//  printing a hexadecimal code
	
	System.out.println(child1.equals(child11));			//  printing value of equals() method called by object child1
	
	if(child1.equals(child11))							//  comparing one object to another object 
	{     												//  and result will be of boolean type true or false
		System.out.println("donot create an object");
	}
	else 
	{
		System.out.println("create a new object");
	}
	}
	public static Object getObject(Object a)      //  taking object as an argument
	{
		if(a.equals("ObjectClassParent"))         //  comparing given Object to the existing name 
		{
			return new ObjectClassParent();		  //  returning it's object if name is same as given name
		}
		else if(a.equals("Maths"))
		{
			return new Maths();
		}
		else
		{
			return null;
		}

	}
	

}
