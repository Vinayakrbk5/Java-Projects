package teston25thapril;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String emailid;

	public Employee(int id, String name, String emailid) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
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

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	@Override
	public String toString() {
		return "CustomObject [id=" + id + ", Name=" + name + ", emailid=" + emailid + "]";
	}

	@Override
	public int compareTo(Employee obj) {
		return this.getName().compareTo(obj.getName());
	}

}
