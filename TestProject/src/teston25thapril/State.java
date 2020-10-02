package teston25thapril;

public class State {
	private String statename;

	public State(String statename) {
		super();
		this.statename = statename;
	}

	public String getstateyname() {
		return statename;
	}

	public void setstateyname(String countryname) {
		this.statename = countryname;
	}

	@Override
	public String toString() {
		return statename;
	}

}
