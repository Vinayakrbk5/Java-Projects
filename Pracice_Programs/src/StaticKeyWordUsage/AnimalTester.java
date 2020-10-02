package StaticKeyWordUsage;

public class AnimalTester extends Animal {

	public static void main(String[] args) {
		AnimalTester test=new AnimalTester();
		test.color="Black";
		test.Char();
		Animal lion=new Animal();
		lion.display("Lion");
		lion.noOflegs=4;
		lion.Char();
		Animal.Char();
	}
	
}
