package ComparableUsedAsComparator;

import java.util.Comparator;

public class OldAgeHome implements Comparator<OldAgeHome> {
	private String name;
	private int age;
	private int id;

	public OldAgeHome(String name,int age,int id)
	{
		this.age=age;
		this.name=name;
		this.id=id;
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
		return "[Name="+name+"  Age="+age+"  Id="+id+"]";
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}

	@Override
	public int compare(OldAgeHome obj1, OldAgeHome obj2) {
		int num=obj1.getId()-obj2.getId();
		if(num==0)
		{
			num=obj1.getName().compareTo(obj2.getName());
		}
		return num;
	}
	}
