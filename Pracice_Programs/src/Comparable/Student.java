package Comparable;


public class Student implements Comparable<Student> {
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

	@Override
	public int compareTo(Student c) {
//		Student c=(Student) obj;
		 if(this.name.compareTo(c.name)==0)
		 {
			 return this.id-c.id;
		 }
		 else 
		 {
			 return this.name.compareTo(c.name);
		 }
	}

}
