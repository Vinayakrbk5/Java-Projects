package ComparableExapmles;
// here Comparable is an interface to sort the elements of normal class list not ArrayList we have to implements Cpmarable 
// Interface of type class Telivision
public class Television implements Comparable<Television>{
	private String brand;
	private Integer inchus;
	private String color;
	
	public Television(String brand,Integer inchus,String color)
	{
		this.brand=brand;
		this.color=color;
		this.inchus=inchus;
	}
	
//	since values are set by the constructor so here set method is not required, only get method is required to get values
	public String getBrand() {
		return brand;
	}

//	public void setBrand(String brand) {
//		this.brand = brand;
//	}

	public Integer getInchus() {
		return inchus;
	}

//	public void setInchus(Integer inchus) {
//		this.inchus = inchus;
//	}

	public String getColor() {
		return color;
	}

//	public void setColor(String color) {
//		this.color = color;
//	}
	public String toString()
	{
		return "brand="+brand+"  "+"color="+color+"  "+"inchus="+inchus;
	}

	@Override
	public int compareTo(Television Tobj1) {
		return this.inchus-Tobj1.inchus;
	}

}
