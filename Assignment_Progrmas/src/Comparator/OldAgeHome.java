package Comparator;

public class OldAgeHome {
	private int id;
	private String name;
	private int age;
	public OldAgeHome(int id,String name,int age)
	{
		this.age=age;
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public String toString()
	{
		return "[Id="+id+"  Name="+name+"  Age="+age+"]";
	}
}
