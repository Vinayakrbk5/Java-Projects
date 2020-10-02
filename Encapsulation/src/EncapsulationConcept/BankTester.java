package EncapsulationConcept;

public class BankTester {

	public static void main(String[] args) {
		Bank sbi = new Bank();
		sbi.setBankname("SBI");
		sbi.setBranch("RajRajeshwari Nagar");

		Employee sbibank = new Employee();
		sbibank.setName("Kiran");
		sbibank.setEmployeeid(102);
		sbibank.setMobileno(9867543256l);

		sbi.setEmployee(sbibank);
		System.out.println(sbi.getBankname() + " is in " + sbi.getBranch());
		System.out.println();
		System.out.println("Mr." + sbibank.getName() + "'s emailid is " + sbibank.getEmployeeid() + " and mobile no is "
				+ sbibank.getMobileno());
	}

}
