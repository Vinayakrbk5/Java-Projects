package PublicModifier3;

import PublicModifier1.SoftwareCompany;
import PublicModifier2.HardwareCompany;

public class HardSoftComapny {

	public static void main(String[] args) {
		SoftwareCompany soft = new SoftwareCompany("Delhi", "silicon hub", "Software"); // importing SoftwareCompany()
																						// class
		HardwareCompany hard = new HardwareCompany("Gujarath", "Hardware"); // importing HardwareCompany() class
		SoftwareCompany.create("hardware"); // importing create method() from SoftwareCompany() class 
											// create() method is static so it is used directly using class name
	}
}
