package EncapsulationPrograms;

public class Nation {
	int noofstates;
	String nationalflag;
	String nationalanimal;
	public Nation(int noofstates,String nationalflag,String nationalanimal)
	{
		this.nationalanimal=nationalanimal;
		this.nationalflag=nationalflag;
		this.noofstates=noofstates;
	}
	
	public int getNoofstates() {
		return noofstates;
	}
	/*public void setNoofstates(int noofstates) {
		this.noofstates = noofstates;
	}*/
	
	public String getNationalflag() {
		return nationalflag;
	}
	/*public void setNationalflag(String nationalflag) {
		this.nationalflag = nationalflag;
	}*/
	
	public String getNationalanimal() {
		return nationalanimal;
	}
	public void setNationalanimal(String nationalanimal) {
		this.nationalanimal = nationalanimal;
	}
	

}
