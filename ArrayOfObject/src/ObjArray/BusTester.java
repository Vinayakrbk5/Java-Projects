package ObjArray;

public class BusTester {

	public static void main(String[] args) {
	BusArray ksrtc=new BusArray(6,2,true);
	BusArray bmtc=new BusArray(8,3,false);
	BusArray busses[]=new BusArray[3];
	busses[0]=ksrtc;
	busses[1]=bmtc;
	for(BusArray c:busses)
	{
		if(c!=null)
		{
			System.out.println(c.getNoofdoors());
			System.out.println(c.getWheels());
			System.out.println(c.isAC());
		}
		System.out.println("------------------------------------------");
		System.out.println();
	}
	
	}
	
}
