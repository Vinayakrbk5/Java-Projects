package testprogramson25thapril;

public class School implements Comparable<School> 
{
	private Integer id;
	private String name;
	private int areapincode;
	private Double fees;
	public School(Integer id, String name, int areapincode, Double fees) {
		super();
		this.id = id;
		this.name = name;
		this.areapincode = areapincode;
		this.fees = fees;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAreapincode() {
		return areapincode;
	}
	public void setAreapincode(int areapincode) {
		this.areapincode = areapincode;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", areapincode=" + areapincode + ", fees=" + fees + "]";
	}
	@Override
	public int compareTo(School obj) {
		return this.fees.compareTo(obj.fees);
	}
//	

}
