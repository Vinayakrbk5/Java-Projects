
public class Fan {
	int capacity;
	String comp;
	String type;
	
	Fan()
	{
		System.out.println("Creating the Fan");
	}
	Fan(String comp, String type, int capacity )
	{
		this.comp=comp;		                                                                                                                                                                          
		this.type=type;
		this.capacity=capacity;
//		System.out.println("The usha Company: "+this.comp+", type :"+this.type+" , capacity : "+this.capacity);
	}
	Fan(int capacity, String comp)
	{
		this.capacity=capacity;
		this.comp=comp;
	}
	

	public static void main(String[] args) {
	
	Fan lg=new Fan();
	lg.capacity=300;
	lg.comp="LG";
	lg.type="Ceiling";
	
	System.out.println("The details about LG Fan");
	System.out.println("The lg Company: "+lg.comp+", type :"+lg.type+" , capacity : "+lg.capacity);
	System.out.println();
	
	Fan usha=new Fan("Usha","Table Fan", 400);
	System.out.println("The details about usha Fan");
	System.out.println("The usha Company: "+usha.comp+", type :"+usha.type+" , capacity : "+usha.capacity);
	System.out.println();
	
	Fan Godrej=new Fan(500, "Godrej");
	System.out.println("The details about Godrej Fan");
	System.out.println("The Godrej Company: "+Godrej.comp+", capacity : "+Godrej.capacity);
	}

}
