package Super_Key_Usage;

public class Display {
	int pixel;
	
	Display()
	{
		//System.out.println("This is parent Display Constructor");
	}
	Display(String name)
	{
		System.out.println("Name in Display is : "+name);
	}
		public  void turnon()
		{
			System.out.println("Turn on TV in Display constructor");
		}
	}
