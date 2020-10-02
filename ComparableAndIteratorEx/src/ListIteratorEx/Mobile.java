package ListIteratorEx;

public class Mobile {
	private String type;
	private String brand;
	private Integer price;
	
	public Mobile(String type,String brand,int price)
	{
		this.type=type;
		this.brand=brand;
		this.price=price;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public String getBrand()
	{
		return brand;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
@Override
public String toString()
{
	return "[Type="+type+" "+"Brand="+brand+" "+"Price="+price+"]";
}
}
