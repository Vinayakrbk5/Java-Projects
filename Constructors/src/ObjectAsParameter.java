
public class ObjectAsParameter {
	int capacity;
	String comp;
	String type;
	
	ObjectAsParameter( String comp,String type,int capacity)
	{
		this.capacity=capacity;
		this.comp=comp;
		this.type=type;
	}
	public static void display(ObjectAsParameter fan)
	{
		System.out.println("The usha Company: "+fan.comp+", type :"+fan.type+" , capacity : "+fan.capacity);
	}

	public static void main(String[] args) {
	ObjectAsParameter Usha=new ObjectAsParameter("Usha","Ceiling",450);
	display(Usha);
	
	ObjectAsParameter godrej=new ObjectAsParameter("Godrej","Table fan",500);
	display(godrej);
	}

}
