package mapex;


public class NationHashMap {
	private  Integer noofstates;
	private String nationcap;
	public NationHashMap(int noofstates, String nationcap) {
		super();
		this.noofstates = noofstates;
		this.nationcap = nationcap;
	}
	public Integer getNoofstates() {
		return noofstates;
	}
	public void setNoofstates(Integer noofstates) {
		this.noofstates = noofstates;
	}
	public String getNationcap() {
		return nationcap;
	}
	public void setNationcap(String nationcap) {
		this.nationcap = nationcap;
	}
	@Override
	public String toString() {
		return "Nation [noofstates=" + noofstates + ", nationcap=" + nationcap + "]";
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return this.noofstates==((NationHashMap)obj).noofstates;
//		return this.noofstates.equals(((Nation)obj).noofstates);
	}  // use == instead of equals() method for  premitive types integer values 
	   // for wrapper class types use equals() and == also applicable but standard use equals()
	
	@Override
	public int hashCode()
	{
		return noofstates;
	}

}
