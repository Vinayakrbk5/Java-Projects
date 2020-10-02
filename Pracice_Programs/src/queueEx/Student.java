package queueEx;

public class Student implements Comparable {
	private String name;
	private int stid;
	private String branch;
	
	public Student(String name,int stid,String branch)
	{
		this.name=name;
		this.stid=stid;
		this.branch=branch;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setStId(int stid)
	{
		this.stid=stid;
	}
	public int getStId()
	{
		return stid;
	}
	
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	public String getBranch()
	{
		return branch;
	}
	
	public String toString()
	{
		return "[Name="+name+"  Id="+stid+"  Branch="+branch+"]";
	}

	@Override
	public int compareTo(Object o) {
		Student s=(Student)o;
		return this.getName().compareTo(s.getName());
	}
}
