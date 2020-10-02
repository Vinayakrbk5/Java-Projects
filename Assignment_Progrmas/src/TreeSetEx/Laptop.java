package TreeSetEx;

public class Laptop implements Comparable<Laptop> {
	private String brand;
	private Integer price;
	private Integer inchus;
	public Laptop(String brand, Integer price, Integer inchus) {
		super();
		this.brand = brand;
		this.price = price;
		this.inchus = inchus;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getInchus() {
		return inchus;
	}
	public void setInchus(Integer inchus) {
		this.inchus = inchus;
	}
	@Override
	public String toString() {
		return "[brand=" + brand + ", price=" + price + ", inchus=" + inchus + "]";
	}
	@Override
	public int compareTo(Laptop l) {
		return this.getPrice()-l.getPrice();
	}
	

}
