package HashMapPackage;

public class State {
	private String statecap;
	private int noofdist;
	public State(int noofdist,String statecap) {
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
	public int getNoofdist() {
		return noofdist;
	}
	public void setNoofdist(int noofdist) {
		this.noofdist = noofdist;
	}
	@Override
	public String toString() {
		return "State [statecap=" + statecap + ", noofdist=" + noofdist + "]";
	}
	
	// it doesnot compares values so it compares only key
	@Override
	public boolean equals(Object obj)
	{
		return this.noofdist==((State)obj).noofdist;
//		return this.noofstates.equals(((Nation)obj).noofstates);
	}  // use == instead of equals() method for  premitive types integer values 
	   // for wrapper class types use equals() and == also applicable but standard use equals()
	
	@Override
	public int hashCode()
	{
		return noofdist;
	}
	
}
