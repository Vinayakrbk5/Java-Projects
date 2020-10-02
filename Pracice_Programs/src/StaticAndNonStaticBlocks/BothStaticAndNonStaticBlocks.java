package StaticAndNonStaticBlocks;

public class BothStaticAndNonStaticBlocks {
	static {
		System.out.println("This  is static block of parent class");
	}
	static {
		System.out.println("Hello Bangalore in satic block");
	}
	BothStaticAndNonStaticBlocks(){
		System.out.println("This is parent class contructor");
	}
	static {
		System.out.println("This is Karnataka in static block");
	}
	{
		System.out.println("This  is Non static block of parent class");
	}
	{
		System.out.println("Hello Bangalore in Non satic block");
	}
	{
		System.out.println("This is Karnataka in Non static block");
	}
	public static void main(String[] args) {
		BothStaticAndNonStaticBlocks obj=new BothStaticAndNonStaticBlocks();
		System.out.println();
		BothStaticAndNonStaticBlocks obj1=new BothStaticAndNonStaticBlocks();
//		System.out.println();
//		StaticBlocksEx parent=new StaticBlocksEx();
		
	}

}
