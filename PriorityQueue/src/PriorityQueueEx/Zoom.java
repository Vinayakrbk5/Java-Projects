package PriorityQueueEx;

public class Zoom implements Comparable<Zoom> {
	private long meetid;
	private String name;
	private long passcode;
	 public Zoom(long meetid,String name, long passcode)
	 {
		 this.meetid=meetid;
		 this.name=name;
		 this.passcode=passcode;
	 }
	public long getMeeetid() {
		return meetid;
	}
	public void setMeeetid(long meeetid) {
		this.meetid = meeetid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPasscode() {
		return passcode;
	}
	public void setPasscode(long passcode) {
		this.passcode = passcode;
	}
	 
	public String toString()
	{
		return "[MeetId="+meetid+"  Name="+name+"  Passcode="+passcode+"]";
	}
	@Override
	public int compareTo(Zoom c) {
		return this.getName().compareTo(c.getName());
	}

}
