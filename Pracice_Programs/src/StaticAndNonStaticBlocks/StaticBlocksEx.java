package StaticAndNonStaticBlocks;

public class StaticBlocksEx {
	static {
		System.out.println("This  is static block of parent class");
	}
	static {
		System.out.println("Hello Bangalore in satic block");
	}
	StaticBlocksEx(){
		System.out.println("This is parent class contructor");
	}
	static {
		System.out.println("This is Karnataka in static block");
	}
	public static void main(String[] args) {
		StaticBlocksEx pa=new StaticBlocksEx();
		StaticBlocksEx par1=new StaticBlocksEx();
	}

}
