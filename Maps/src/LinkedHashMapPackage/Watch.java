package LinkedHashMapPackage;

public class Watch {
	private Boolean isDigital;
	private String Brand;
	private String Bandcolor;
	public Watch(Boolean isDigital, String brand, String bandcolor) {
		super();
		this.isDigital = isDigital;
		Brand = brand;
		Bandcolor = bandcolor;
	}
	public Boolean getIsDigital() {
		return isDigital;
	}
	public void setIsDigital(Boolean isDigital) {
		this.isDigital = isDigital;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getBandcolor() {
		return Bandcolor;
	}
	public void setBandcolor(String bandcolor) {
		Bandcolor = bandcolor;
	}
	@Override
	public String toString() {
		return "[isDigital=" + isDigital + ", Brand=" + Brand + ", Bandcolor=" + Bandcolor + "]";
	}
	

}
