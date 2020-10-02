package defaultAtatic;

public class FruitSalad implements Lemons,Oranges {
public void citrusLevel()
{
	Lemons.super.citrusLevel();   //calling from Lemons Class
	Oranges.super.citrusLevel();  // calling from Orange class
	System.out.println("citrus level from FruitSalad");
}
public static void main(String[] args) {
	FruitSalad fr=new FruitSalad();
	fr.citrusLevel();   // printing latest one 
}
}
