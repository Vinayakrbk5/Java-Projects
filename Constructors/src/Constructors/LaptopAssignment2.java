package Constructors;

public class LaptopAssignment2 {
	int current;
	int voltage;

	LaptopAssignment2(int current)
	{
		this.current =current;
		System.out.println("about Lenovo Laptop");
		System.out.println("The Lenovo Laptop consumes "+this.current+" mAmp");
	}
	LaptopAssignment2(int current,int voltage)
	{
		this .current=current;
		this.voltage=voltage;
		
		System.out.println("about Sony Laptop");
		System.out.println("The Sony Laptop consumes current of "+ this.current+" mAmp and Voltage of "+this.voltage+" volts");
	}
	public static void main(String[] args) {
		
	LaptopAssignment2 lenovo=new LaptopAssignment2(10);
	System.out.println();
	
	LaptopAssignment2 sony=new LaptopAssignment2(15,150);
	
	
	}

}
