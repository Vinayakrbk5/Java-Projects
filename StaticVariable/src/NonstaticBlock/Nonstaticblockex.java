package NonstaticBlock;

public class Nonstaticblockex {
	int i=10;
	{
		System.out.println("printing from nonstatic block");
	}
	Nonstaticblockex()
	{
		System.out.println("Constructor is been called");
	}
	{
		System.out.println("block2");
	}
	public static void main(String[] args) {
		System.out.println("printing from main method");
		Nonstaticblockex obj=new Nonstaticblockex();
		System.out.println("printig second time from main method");
		Nonstaticblockex obj2=new Nonstaticblockex();
	}
	{
		System.out.println("Block3");
	}

}
