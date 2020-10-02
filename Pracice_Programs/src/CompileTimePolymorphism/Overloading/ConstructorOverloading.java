package CompileTimePolymorphism.Overloading;

public class ConstructorOverloading {
	int x;
	int y;
	
	 public  ConstructorOverloading()
	{
		System.out.println(" The sum of a and b is :"+(x+y));  //  this constructor will be executed taking assigned x and values
	}															//  if not assigned any values it takes default values as zero
	ConstructorOverloading(int x)
	{
		System.out.println("The value of x is :"+x);
	}
	ConstructorOverloading(int x,int y)
	{
		System.out.println("The sum is :"+(x+y));
	}
	ConstructorOverloading(int x,int y,int z)
	{
		System.out.println("The sum of three numbers is :"+(x+y+z));
	}
	public void display()
	{
		System.out.println("The values of  p and q is :"+x+", "+y);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading();
		obj.x=20;  // these variables cannot be send as an arguments because there are non static variables
		obj.y=100; // these can be send making these variables as static 
		obj.display();
		
		
	
	}

}
