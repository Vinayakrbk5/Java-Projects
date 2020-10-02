package PrivateModifier;

public class World {
	private int size;                  // private modifier instance variable

	private World(String name)         // this is private modifier class so it is not visible other any other class and packages
	{
		System.out.println(name + " has the second huge population after the china");
	}

	private static void pop(int population) // private modifier method()
	{
		System.out.println("India's population is : " + population + " crores");
	}

	public static void main(String[] args) {
		World india = new World("India");
		pop(130);
		india.size = 7;
		System.out.println("India is the " + india.size + "th biggest country in the world");

	}

}
