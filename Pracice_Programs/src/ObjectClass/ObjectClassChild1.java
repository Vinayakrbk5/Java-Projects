package ObjectClass;

public class ObjectClassChild1 extends ObjectClassParent {
	String name;
	String city;
	int id=45;
	public boolean equals(Object obj)
	{
		return (this.city.equals(((ObjectClassChild1)obj).city));
	}
	public int hashCode()
	{
		return id;
	}

}
