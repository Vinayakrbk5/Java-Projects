package StaticAndNonStaticBlocks;

public class NonStaticBlocks {
	{
		System.out.println("This  is Non static block of parent class");
	}
	{
		System.out.println("Hello Bangalore in Non satic block");
	}

	NonStaticBlocks() {
		System.out.println("This is parent class contructor");
	}

	{
		System.out.println("This is Karnataka in Non static block");
	}

	public static void main(String[] args) {
		NonStaticBlocks pa = new NonStaticBlocks();
		System.out.println();
		//NonStaticBlocks par=new NonStaticBlocks();
	}

}
