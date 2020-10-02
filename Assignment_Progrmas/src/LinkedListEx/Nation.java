package LinkedListEx;

public class Nation implements Comparable<Nation>{
	private String state;
	private Integer stid;
	private String stcapital;
	
	public Nation(String state,Integer stid,String stcapital)
	{
		this.state=state;
		this.stid=stid;
		this.stcapital=stcapital;
	}
	
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState()
	{
		return state;
	}
	
	public void setStId(int stid)
	{
		this.stid=stid;
	}
	public int getStId()
	{
		return stid;
	}
	
	public void setStCapital(String stcapital)
	{
		this.stcapital=stcapital;
	}
	public String getStCapital()
	{
		return stcapital;
	}
	
	public String toString()
	{
		return "[State="+state+",  State Code="+stid+",  State Capital="+stcapital+"]";
	}

	@Override
	public int compareTo(Nation N) {
		return this.stid-N.stid;
	}
}
