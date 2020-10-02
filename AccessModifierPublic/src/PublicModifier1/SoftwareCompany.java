package PublicModifier1;

public class SoftwareCompany {
	public String sense;   // instance variable has public modifier means it is visible in any where 

	public SoftwareCompany(String name1, String name2, String name3) {  // class constructor is public
		System.out.println(name1 + " is called as " + name2 + " city because of " + name3 + " hub");
	}

	public static void create(String name) {  // method create() is public 
		System.out.println(name + " is used to devolop the systems");
	}

	public static void main(String[] args) {
		SoftwareCompany soft = new SoftwareCompany("Bangalore", "Silicon", "Software");
		create("Software");
		soft.sense = "Sensable";
		System.out.println("Software is only " + soft.sense + " cannot touch");
	}

}
