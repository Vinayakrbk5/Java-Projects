package bustester2;

public class Bustesterclass {

	public static void main(String[] args) {
		Bus ksrtc=new Bus();
		ksrtc.setdoorno(2);
		int ksrtcdoorno=ksrtc.getdoorno();
		
		ksrtc.setwheelno(6);
		int ksrtcwheelno=ksrtc.getwheelno();
		
		ksrtc.setisAC(true);
		boolean ksrtcAC=ksrtc.getisAC();
		
		ksrtc.settype("KSRTC");
		String bustype=ksrtc.gettype();
		
		System.out.println("Bus has "+ksrtcdoorno+" doors");
		System.out.println("Bus has "+ksrtcwheelno+" wheels");
		System.out.println("it's "+ksrtcAC+" bus is of type AC");
		System.out.println("This is "+bustype+" bus");
	}

}
