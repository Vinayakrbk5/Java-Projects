package EncapsulationConcept;

public class TraineeTester {

	public static void main(String[] args) {
	Trainee shankar=new Trainee();
	shankar.setName("Shankar");
	shankar.setEmailid("Shankar@gmail.com");
	shankar.setMobile(8987654321l);
	
	Address shankaraddr=new Address();
	
	shankaraddr.setStreet("Mysore Road");
	shankaraddr.setCity("Bangalore");
	shankaraddr.setState("Karnataka");
	shankaraddr.setPincode(560098);
	
	shankar.setAddress(shankaraddr);
	System.out.println("Mr."+shankar.getName()+"' emailid is "+shankar.getEmailid()+" and mobile no is "+shankar.getMobile());
	System.out.println();
	System.out.println("Mr."+shankar.getName()+"' address is :"+shankaraddr.getStreet()+", "+shankaraddr.getCity()+", "+shankaraddr.getState()+"-"+shankaraddr.getPincode());
	
	}

}
