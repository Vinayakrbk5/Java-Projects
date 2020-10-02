package AccessModifiers;

public class Weather {
	// private int min temp; //it is private it is outside of the present class
	private int minTemp;
	int maxTemp;
	int density;
	String climatebehaviour;

	public Weather() {
		System.out.println("displaying the weather seasons");
	}

	public Weather(int minTemp, int maxTemp, int density, String climatebehaviour) {
		this.minTemp = minTemp;
		this.maxTemp = maxTemp;
		this.density = density;
		this.climatebehaviour = climatebehaviour;
	}

	public void display() {
		System.out.println("The minimum Temp is :" + minTemp);
		System.out.println("The Maximum Temp is : " + maxTemp);
		System.out.println(" The density is : " + density);
		System.out.println("The season is : " + climatebehaviour);
	}

	public static void main(String[] args) {
		// all private members are accessible in the same class only
		Weather sunny = new Weather();
		sunny.display();
	}

}
