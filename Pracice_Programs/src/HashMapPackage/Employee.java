package HashMapPackage;

public class Employee implements Comparable<Employee> {
	private String name;
	private Integer empid;
	public Employee(String name, Integer empid) {
		super();
		this.name = name;
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", empid=" + empid + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return this.name.equalsIgnoreCase(((Employee)obj).name); // which will ignore case
//		return this.empid.equals(((Employee)obj).empid);
	}
	@Override
    public int hashCode() {
	return name.hashCode();
	}
	@Override
	public int compareTo(Employee obj) {
		return this.name.compareTo(obj.name);
	}

}
