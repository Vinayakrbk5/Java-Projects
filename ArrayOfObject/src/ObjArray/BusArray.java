package ObjArray;

public class BusArray {
	private int wheels;
	private int noofdoors;
	private boolean isAC;
	
	public int getWheels() {
		return wheels;
	}

	/*public void setWheels(int wheels) {
		this.wheels = wheels;
	}
*/
	public int getNoofdoors() {
		return noofdoors;
	}

	/*public void setNoofdoors(int noofdoors) {
		this.noofdoors = noofdoors;
	}*/

	public boolean isAC() {
		return isAC;
	}

	/*public void setAC(boolean isAC) {
		this.isAC = isAC;
	}*/

	
	
	public BusArray(int wheels,int noofdoors,boolean isAC)
	{
		this.wheels=wheels;
		this.noofdoors=noofdoors;
		this.isAC=isAC;
	}
}
