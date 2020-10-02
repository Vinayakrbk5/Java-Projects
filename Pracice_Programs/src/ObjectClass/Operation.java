package ObjectClass;

public class Operation {
	int a=10;
	int b=70;
	int x=10;
	String name;
	String add;
	@Override
	public String toString()
	{
		return "a="+a+" and "+" b= "+b;
	}
	@Override
	public boolean equals(Object obj) {
		return this.name.equals(((Maths)obj).newname);
	   // boolean result= this.name.equals(((Operation)obj).name);
       // return result;
		}
	@Override
	public int hashCode() {
		return a;
	}

	/*public boolean equals(Object temp)
	{
		return
	}*/
}
