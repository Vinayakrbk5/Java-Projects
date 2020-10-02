package This_Keyword_programs;

public class Purse {
	String color;
	double moneycontains;
	String currency;
	
	public Purse()
	{
		this("Red");
	}
	public Purse(String color)
	{
	this(color, 1000);	
	}
	public Purse(String color,double moneycontains) {
	this(color, moneycontains, "Rupee");	
	}
	public Purse(String color, double moneycontains,String currency)
	{
		this.color=color;
		this.moneycontains=moneycontains;
		this.currency=currency;
		System.out.println("color is "+color+", has money "+moneycontains+", hsas currency of "+currency);
	}
	public Purse Display()
	{
		return this;  //  returning an object
	}
	public void nation()
	{
		System.out.println("This is my India");
	}
}
