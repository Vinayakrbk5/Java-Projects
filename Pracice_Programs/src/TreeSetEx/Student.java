package TreeSetEx;

public class Student implements Comparable<Student> {
	private String name;
	private int id;
	
	public Student(String name,int id)
	{
		this.name=name;
		this.id=id;
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
	
	public String toString()
	{
		return "[Name="+name+"  Id="+id+"]";
	}

	@Override
	public int compareTo(Student s) {
		return this.id-s.id;
	}
	
}
