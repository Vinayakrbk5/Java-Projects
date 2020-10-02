package AccessModifiers;

public class WeatherTester {

	public static void main(String[] args) {
	Weather sunny=new Weather(25,43,100,"Sunny");
	sunny.display();  
	sunny.minTemp=20;  // error bcz minTemp is private Method
	}

}