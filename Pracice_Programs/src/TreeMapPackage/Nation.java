package TreeMapPackage;

public class Nation {
	private String Nationcap;
	private Integer noofstates;
	public Nation(String nationcap, Integer noofstates) {
		super();
		Nationcap = nationcap;
		this.noofstates = noofstates;
	}
	public String getNationcap() {
		return Nationcap;
	}
	public void setNationcap(String nationcap) {
		Nationcap = nationcap;
	}
	public Integer getNoofstates() {
		return noofstates;
	}
	public void setNoofstates(Integer noofstates) {
		this.noofstates = noofstates;
	}
	@Override
	public String toString() {
		return "Nation [Nationcap=" + Nationcap + ", noofstates=" + noofstates + "]";
	}
	

}
