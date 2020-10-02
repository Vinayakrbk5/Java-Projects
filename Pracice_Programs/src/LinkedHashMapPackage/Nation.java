package LinkedHashMapPackage;

public class Nation {
	private String nationcap;
	private int noofstates;
	public Nation(String nationcap, int noofstates) {
		super();
		this.nationcap = nationcap;
		this.noofstates = noofstates;
	}
	public String getNationcap() {
		return nationcap;
	}
	public void setNationcap(String nationcap) {
		this.nationcap = nationcap;
	}
	public int getNoofstates() {
		return noofstates;
	}
	public void setNoofstates(int noofstates) {
		this.noofstates = noofstates;
	}
	@Override
	public String toString() {
		return "Nation [nationcap=" + nationcap + ", noofstates=" + noofstates + "]";
	}
	

}
