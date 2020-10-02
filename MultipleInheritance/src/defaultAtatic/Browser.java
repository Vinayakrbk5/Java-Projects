package defaultAtatic;

public interface Browser {
	public void search();
	public default void plugin()  // defined in interface using default keyword
	{
		System.out.println("Introducing new feature");
	}
	public static void inconito()
	{
		System.out.println("inconito from browser");
	}

}
