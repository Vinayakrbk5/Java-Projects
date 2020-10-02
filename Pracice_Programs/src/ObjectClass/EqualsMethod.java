package ObjectClass;

public class EqualsMethod {
	public static void main(String[] args) {
		Operation op=new Operation();
		op.a=10;
		op.name="Vinayak";
		Operation op1=new Operation();
		op1.a=20;
		op1.name="Vinayak";
		
		Maths math=new Maths();
		math.newname="Vinayak";
		
		if (op.equals(math))
		{
			System.out.println("donot create an object");
		}
		else
		{
			System.out.println("create an object");
		}
		if (op.name.equals(math.newname))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
