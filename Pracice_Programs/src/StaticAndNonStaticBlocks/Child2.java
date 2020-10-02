package StaticAndNonStaticBlocks;

public class Child2 extends Child1{
	static {
		System.out.println("This is static block in Child2 class");
		System.out.println();
	}
	 {
		System.out.println("This is Bangalore in non static child2 block");
	}
	Child2()
	{
		System.out.println("This is Child2 class constructor");
		System.out.println();
	}
}



