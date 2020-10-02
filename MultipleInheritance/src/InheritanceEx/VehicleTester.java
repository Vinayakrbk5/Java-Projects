package InheritanceEx;

public class VehicleTester extends Bus implements Bike {
	public void Stroke()
	{
		System.out.println("Stroke in Vehicle tester");
	}
	public void engine()
	{
		System.out.println("The engine in vehicle testers");
	}
public static void main(String[] args) {
	VehicleTester v=new VehicleTester();
	v.stroke();
	v.engine();
	// v.a;
}
}
