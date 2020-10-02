package LinkedHashSetEx;

public class Employees implements Comparable<Employees> {
	private String name;
	private Integer id;
	private String dep;
	public Employees(String name, Integer id, String dep) {
		super();
		this.name = name;
		this.id = id;
		this.dep = dep;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", dep=" + dep + "]";
	}
	@Override
	public int compareTo(Employees e) {
		return this.getId()-e.getId();
	}
	

}
