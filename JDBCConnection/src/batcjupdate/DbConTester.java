package batcjupdate;

import singletonclasspackage.SingleTonClassEx;

public class DbConTester {

	public static void main(String[] args) {
		SingleTonClassEx dbconn=SingleTonClassEx.getInstance();
		System.out.println(dbconn.hashCode());
		
		SingleTonClassEx dbconn2=SingleTonClassEx.getInstance();
		System.out.println(dbconn2.hashCode());
		
		System.out.println("Equal: "+(dbconn==dbconn2));
	}
}
