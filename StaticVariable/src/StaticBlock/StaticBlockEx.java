package StaticBlock;

public class StaticBlockEx {
	int i=10;
	static
	{
		System.out.println("printing from static block");
	}
	StaticBlockEx()
	{
		System.out.println("Constructor is been called");
	}
	static
	{
		System.out.println("static block 2");
	}
	public static void main(String[] args) {
		System.out.println("printing from main method");
		StaticBlockEx obj=new StaticBlockEx();
	}
	static
	{
		System.out.println("Block3");
	}

}
