package TreeMapPackage;

public class State {
	private String statecap;
	private Integer noofdist;
	public State(String statecap, Integer noofdist) {
		super();
		this.statecap = statecap;
		this.noofdist = noofdist;
	}
	public String getStatecap() {
		return statecap;
	}
	public void setStatecap(String statecap) {
		this.statecap = statecap;
	}
	public Integer getNoofdist() {
		return noofdist;
	}
	public void setNoofdist(Integer noofdist) {
		this.noofdist = noofdist;
	}
	@Override
	public String toString() {
		return "State [statecap=" + statecap + ", noofdist=" + noofdist + "]";
	}
	

}
