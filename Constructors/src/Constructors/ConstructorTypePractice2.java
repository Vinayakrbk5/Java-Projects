package Constructors;

public class ConstructorTypePractice2 {
	
	  static int x=100;
	 static int y=200;
	
	ConstructorTypePractice2()
	{
		x=50;
		y=100;
	}
	
	ConstructorTypePractice2(int x,int y)
	{
		//System.out.println("first time is : "+(x+y));
		this.x=x;
		this.y=y;
	}
	
	public static void add() // if this is not parametric then to make use of x and y variables in this method
	{								    // x and y have to be declared as static in the class otherwise it cannot allows access to us
		int sum=x+y;					// because instance variables are accessible only by using object that too in the main method only
		System.out.println("The sum of two numbers is : "+sum);
	}
	
	public static void main(String[] args) {
		ConstructorTypePractice2 obj=new ConstructorTypePractice2();
		ConstructorTypePractice2 sum=new ConstructorTypePractice2(10,20);// this value is assigned only when sum1 object is not created
		ConstructorTypePractice2 sum1=new ConstructorTypePractice2(500,200); // this constructor value is assigned first
		//add()  for this constructor values are taken
		add(); // if this is parametric these values are taken first if not above constructor values are taken
		

	}

}
