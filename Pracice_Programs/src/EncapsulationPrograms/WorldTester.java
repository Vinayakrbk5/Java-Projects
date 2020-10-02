package EncapsulationPrograms;

public class WorldTester {

	public static void main(String[] args) {
	
		World obj=new World();
		World obj2= new World();
		Nation nativ =new Nation(30,"three coloured","Tiger");
		
		//obj.setName("India");
		//obj.setNoOfNations(198);
		
		 String c=obj.getName();
		int n=obj.getNoOfNations();
		System.out.println("Nation :"+c);
		System.out.println("No of nations :"+n);
		System.out.println("--------------------------------");
		
		System.out.println("Nation :"+obj2.getName());
		System.out.println("No of nations :"+obj2.getNoOfNations());
		
		System.out.println();
		System.out.println("about state details");
		/*nativ.setNoofstates(30);
		nativ.setNationalflag("three colored");
		nativ.setNationalanimal("Tiger");*/
		
		System.out.println("National flag :"+nativ.getNationalflag());
		System.out.println("National animal :"+nativ.getNationalanimal());
		System.out.println("No of states :"+nativ.noofstates);
	}

}
