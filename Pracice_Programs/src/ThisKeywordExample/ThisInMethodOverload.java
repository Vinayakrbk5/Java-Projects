package ThisKeywordExample;

public class ThisInMethodOverload {

	int x;
	int y;
	
	public void display(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("The value of x and y is :"+x+", "+y);
	}
	public void display(int a)
	{
		System.out.println("The value of a is :"+a);
	}
	ThisInMethodOverload()
	{
		this(30);
		System.out.println("The values are :"+x+", "+y);
	}
	ThisInMethodOverload(int x,int y)
	{
		//this(89);
		System.out.println("The values of x and y are :"+x+", "+y);
	}
	 
	ThisInMethodOverload(int x)
	{
		this(35,40);
		System.out.println("The value of x is :"+x);
	}
	
	
	public static void main(String[] args) {
		 
		ThisInMethodOverload obj=new ThisInMethodOverload();
		ThisInMethodOverload obj1=new ThisInMethodOverload(55);
		ThisInMethodOverload obj2=new ThisInMethodOverload(10,25);
		
		obj.display(20,80);
		
	}
}

