package DefaultMethodsInInterface;

public interface ClassB {
	public default int display()
	{
		//System.out.println("This is display method in Class B");
		return 10;
	}

}
