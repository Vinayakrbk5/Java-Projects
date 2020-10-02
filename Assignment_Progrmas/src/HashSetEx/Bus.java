package HashSetEx;

public class Bus {
	private String name;
	private Boolean isac;
	private Integer noofwheels;
	public Bus(String name, Boolean isac, Integer noofwheels) {
		super();
		this.name = name;
		this.isac = isac;
		this.noofwheels = noofwheels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIsac() {
		return isac;
	}
	public void setIsac(Boolean isac) {
		this.isac = isac;
	}
	public Integer getNoofwheels() {
		return noofwheels;
	}
	public void setNoofwheels(Integer noofwheels) {
		this.noofwheels = noofwheels;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", isac=" + isac + ", noofwheels=" + noofwheels + "]";
	}
	

}
