package PublicModifier2;

import PublicModifier1.SoftwareCompany;

public class HardwareCompany {

	public HardwareCompany(String name, String name1) // public class constructor
	{
		System.out.println(name + " is famous for " + name1 + " fabrication");
	}

	public static void main(String[] args) {
		HardwareCompany hard = new HardwareCompany("Maharastra", "Hardware");
		SoftwareCompany sof = new SoftwareCompany("Chennai", "Soft", "Software"); // here importing SoftwareCompany()
																					// class
		sof.sense = "Hardware"; // imported instance variable from SoftwareCompany() class
		System.out.println(sof.sense + " can be seen and touch");

	}

}
