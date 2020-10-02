package DynamicPolymorphismExamples;

public class ElectronicGadgetsTester {
	public static void main(String[] args) {
		TableFan usha = new TableFan(); // object of same class
		usha.motorRunning();
		System.out.println(usha.i);
		// upcasting
		Fan fan = usha; // Object creation using upcasting
		fan.motorRunning();
		fan.increaseSpeed();
		ElectronicGadgets eg = usha; // Object creation using upcasting
		eg.motorRunning();
		System.out.println(fan.i);
		System.out.println("-------------------------------");
		System.out.println();

		Fan fan2 = new Fan(); // Object of the same class
		fan2.motorRunning();

		// upcasting
		ElectronicGadgets eg2 = fan2; // Object creation using upcasting
		eg2.motorRunning();
		System.out.println("---------------------------------");
		System.out.println();

		ElectronicGadgets eg3 = new ElectronicGadgets(); // object of the same class
		eg3.motorRunning();

	}

}
