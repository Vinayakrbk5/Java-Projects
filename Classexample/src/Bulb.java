
public class Bulb {
	int current;
	int volt;
	int intensity;
	
	Bulb(){
		System.out.println("bulb is created");
	}
	
    void on()
    {
    	System.out.println("bulb is on");
    }
    void off()
    {
    	System.out.println("bulb is off");
    }
    void hot()
    {
    	System.out.println("bulb is heated");
    }

	public static void main(String[] args) {
		
Bulb cisca=new Bulb();   // object cisca is created

cisca.current=2;     //variables initialization
cisca.intensity=50;
cisca.volt=10;
System.out.println();

System.out.println("The cisca bulb uses "+cisca.current+" mamp");
System.out.println("cisca bulb gives "+cisca.intensity+" volt/amp");
System.out.println("cisca bulb uses "+cisca.volt+" volts");
System.out.println();

cisca.on();       //calling methods
cisca.off();
cisca.hot();

System.out.println();

Bulb GM=new Bulb();     //// object GM is created

GM.current=5;           //variables initialization
GM.intensity=100;
GM.volt=15;
System.out.println();

System.out.println("The cisca bulb uses "+GM.current+" mamp");
System.out.println("cisca bulb gives "+GM.intensity+" volt/amp");
System.out.println("cisca bulb uses "+GM.volt+" volts");
System.out.println();

GM.on();        //calling methods
GM.off();
GM.hot();

System.out.println();

Bulb vihan=new Bulb();    // object vihan is created

vihan.current=10;         //variables initialization
vihan.intensity=150;
vihan.volt=20;
System.out.println();

System.out.println("The cisca bulb uses "+vihan.current+" mamp");
System.out.println("cisca bulb gives "+vihan.intensity+" volt/amp");
System.out.println("cisca bulb uses "+vihan.volt+" volts");
System.out.println();

vihan.on();        //calling methods
vihan.off();
vihan.hot();
	}

}
