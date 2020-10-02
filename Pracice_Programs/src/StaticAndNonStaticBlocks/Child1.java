package StaticAndNonStaticBlocks;

public class Child1 extends Parent {
	static {
		System.out.println("This is  static block in Child1 class");
	}
	//public static int a=sum();
	 {
		System.out.println("This is Bangalore in Child1 Non static block");
	}
	Child1()
	{
		System.out.println("This is Child1 class constructor");
		System.out.println();
	}
}


