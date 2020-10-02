package ListIterator;

public class Student {
	private String name;
	private int id;
	private String city;
	
	public Student(String name,int id,String city)
	{
		this.city=city;
		this.id=id;
		this.name=name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	
	public String toString()
	{
		return "[name="+name+"  city="+city+"  Id="+id+"]";
	}

}
