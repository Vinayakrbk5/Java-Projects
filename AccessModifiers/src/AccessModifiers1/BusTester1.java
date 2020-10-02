package AccessModifiers1;

import AccessModifiers.Bus1;

public class BusTester1 {

	public static void main(String[] args) {
		Bus1 bmtc = new Bus1();
		// ksrtc.setdoorno(4);
		int ksrtcdoorno = bmtc.getdoorno();

		// ksrtc.setwheelno(6);
		int ksrtcwheelno = bmtc.getwheelno();

		// ksrtc.setisAC(true);
		boolean ksrtcAC = bmtc.getisAC();

		// ksrtc.settype("KSRTC");
		String bustype = bmtc.gettype();

		System.out.println("Bus has " + ksrtcdoorno + " doors");
		System.out.println("Bus has " + ksrtcwheelno + " wheels");
		System.out.println("It's " + ksrtcAC + " bus is of type Non AC");
		System.out.println("This is " + bustype + " bus");
	}

}
