//8).Write a program to contain single unique elements and must be in sorted order
//    School Program
package teston25thapril;

public class School implements Comparable<School> {
	private int id;
	private String name;
	private int areapincode;
	private Double fees;

	public School(int id, String name, int areapincode, Double fees) {
		this.id = id;
		this.name = name;
		this.areapincode = areapincode;
		this.fees = fees;
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
		return "Id=" + id + ", Name=" + name + ", AreaPincode=" + areapincode + ", Fees=" + fees ;
	}

	@Override
	public int compareTo(School obj) {
		return this.getFees().compareTo(obj.getFees());
	}

}
