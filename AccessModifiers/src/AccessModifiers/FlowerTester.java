package AccessModifiers;

public class FlowerTester {
	public static void main(String[] args) {
		Flower sunflower = new Flower();

		sunflower.setname("SunFlower");
		String name = sunflower.getname();
		System.out.println("Name of the flower is : " + name);

	}

}
