package AssignmentOnInterfaceToAbstractClassToClass;

public abstract class Mammals implements Animals{
//	static int a=10;
	public void noise()
	{
		System.out.println("Animals are making noise");
	}
	public static String display()
	{
		return "Animals";
	}
	public void birth();
}
