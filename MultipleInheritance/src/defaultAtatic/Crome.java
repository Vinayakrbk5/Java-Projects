package defaultAtatic;

public class Crome  implements Browser{

	@Override
	public void search() {
		System.out.println(" search facility from crome");		
	}
	public void plugin()   //  overridden method
	{
		System.out.println("Plugin facility from crome");
	}

}
