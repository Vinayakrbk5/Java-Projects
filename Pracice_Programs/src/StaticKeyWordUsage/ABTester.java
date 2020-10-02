package StaticKeyWordUsage;

public class ABTester extends B {
	
	public static void main(String[] args) {
		ABTester b=new ABTester();
		b.name="India";
		b.noofstates=30;
		System.out.println("a="+b.a+" and b="+b.b);
		System.out.println(b.name+" has "+b.noofstates+" States");
		b.display();
		System.out.println(b.sum());
		b.state();
		System.out.println(b.mul());
		
	}
	
}
