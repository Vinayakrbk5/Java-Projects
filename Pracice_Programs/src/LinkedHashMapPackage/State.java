package LinkedHashMapPackage;

public class State {
	private String statecap;
	private int noofdist;
	@Override
	public String toString() {
		return "State [statecap=" + statecap + ", noofdist=" + noofdist + "]";
	}
	public String getStatecap() {
		return statecap;
	}
	public void setStatecap(String statecap) {
		this.statecap = statecap;
	}
	public int getNoofdist() {
		return noofdist;
	}
	public void setNoofdist(int noofdist) {
		this.noofdist = noofdist;
	}
	public State(String statecap, int noofdist) {
		super();
		this.statecap = statecap;
		this.noofdist = noofdist;
	}
	

}
