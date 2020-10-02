package TreeMapPackage;
public class Employee {
	private String name;
	private Integer eid;
	public Employee(String name, Integer eid) {
		super();
		this.name = name;
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}
	public boolean equals(Object obj) {
		return this.name.equals(((Employee)obj).name);
	}
	public int hashCode() {
////		int num2=new Integer(name).intValue();
////		int num = Integer.valueOf(name);
////		int num = Integer.parseInt(name);
//		System.out.println("Hashcode is :"+name.hashCode());
		return name.hashCode();
	}

}
