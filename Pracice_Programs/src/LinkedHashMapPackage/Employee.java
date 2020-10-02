package LinkedHashMapPackage;

public class Employee {
	private String name;
	private int empuid;
	public Employee(String name, int empuid) {
		super();
		this.name = name;
		this.empuid = empuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpuid() {
		return empuid;
	}
	public void setEmpuid(int empuid) {
		this.empuid = empuid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empuid=" + empuid + "]";
	}
	

}
