package FunctionalInterface;

public class DisplayTester {
	public static void main(String[] args) {
		DisplayInterface dis=new DisplayInterface()
				{
			public void display()
			{
				System.out.println("This is display interface method");
			}
				};
				
		dis.display();
		DisplayInterface displ=()->System.out.println("This is display interface method in java");
		displ.display();
	}
	

}
