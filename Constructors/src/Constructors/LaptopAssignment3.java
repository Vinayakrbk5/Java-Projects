package Constructors;

public class LaptopAssignment3 {
	int weight;
	String color;
	String brand;
	
	LaptopAssignment3(int weight, String color,String brand)
	{
	    this.weight=weight;
	    this.color=color;
	    this.brand=brand;
	}
	
public static void display(LaptopAssignment3 obj)
{
	System.out.println("The laptop "+obj.brand+" has weight of "+obj.weight+" kg and it's color is "+obj.color);
}
	public static void main(String[] args) {
		
	LaptopAssignment3 lg=new LaptopAssignment3(10,"white","LG");
	LaptopAssignment3 dell =new LaptopAssignment3(12,"Black","Dell");
	
	System.out.println("displaying about LG Laptop");
	display(lg);  //displaying lg 
	System.out.println();
	
	System.out.println("displaying about Dell Laptop");
	display(dell); // displaying dell
	} 

}
