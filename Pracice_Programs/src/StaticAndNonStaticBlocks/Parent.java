package StaticAndNonStaticBlocks;

public class Parent {
	static {
		System.out.println("This is static block in parent class");
	}
	/*public static  int sum()
	{
		System.out.println("This is sum method");
		return 20;
	}*/
	 {
		System.out.println("This is Bangalore in Parent class non static block");
	}
	Parent()
	{
		System.out.println("This is parent class constructor");
		System.out.println();
	}
}
