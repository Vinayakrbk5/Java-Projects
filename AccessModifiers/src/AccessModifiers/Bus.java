package AccessModifiers;

public class Bus {
	private int doorno;
	private int wheelno;
	boolean isAC;
	private String type;

	protected void setdoorno(int doorno) {
		this.doorno = doorno;
	}

	public int getdoorno() {
		return doorno;
	}

	protected void setwheelno(int wheelno) {
		this.wheelno = wheelno;
	}

	protected int getwheelno() {
		return wheelno;
	}

	protected void setisAC(boolean isAC) {
		this.isAC = isAC;
	}

	protected boolean getisAC() {
		return isAC;
	}

	protected void settype(String type) {
		this.type = type;
	}

	protected String gettype() {
		return type;
	}

}
