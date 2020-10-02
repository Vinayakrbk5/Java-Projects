package LinkedHashMapPackage;

public class Student {
	private String name;
	private int stid;
	public Student(String name, int stid) {
		super();
		this.name = name;
		this.stid = stid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", stid=" + stid + "]";
	}
	

}
