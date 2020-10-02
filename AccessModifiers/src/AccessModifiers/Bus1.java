package AccessModifiers;

public class Bus1 {
	private int doorno=3;        // here also value can be assigned
	private int wheelno=8;
	private boolean isAC=false;
	private String type="BMTC";
    
	/*public Bus1() {        // constructor is used instead of setmethod() type
		doorno = 3;
		wheelno = 8;
		isAC = false;
		type = "BMTC";
	}*/
           //  value can be assigned using setmethod() 
	/*
	 * protected void setdoorno(int doorno) { this.doorno=doorno; }   
	 */
	public int getdoorno() {
		return doorno;
	}

	/*
	 * protected void setwheelno(int wheelno) { this.wheelno=wheelno; }
	 */
	public int getwheelno() {
		return wheelno;
	}

	/*
	 * protected void setisAC(boolean isAC) { this.isAC=isAC; }
	 */
	public boolean getisAC() {
		return isAC;
	}

	/*
	 * protected void settype(String type) { this.type=type; }
	 */
	public String gettype() {
		return type;
	}

}
