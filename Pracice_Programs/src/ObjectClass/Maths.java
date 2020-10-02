package ObjectClass;

public class Maths  {
	String newname="Bnagalore";
	
	public static void main(String[] args) {
		Operation op=new Operation();
		//System.out.println(op);
		
		op.a=34;
		op.b=67;
		op.name="Vinayak";
		Operation op2=new Operation();
		op2.a=90;
		op2.b=45;
		op2.name="Bhilawadi";
		System.out.println(op.toString());
		System.out.println(op2.toString());
		
		if(op.equals(op2))     //  equals() method is used for comparing two Strings but not for two numeric numbers
		{
			System.out.println("donot create an object");
		}
		else 
		{
			System.out.println("create a new object");
		}
		if(op.a==op2.a)        //  == is used to compare two numeric numbers but not Strings     
		{
			System.out.println("value of a is same for two objects");
		}
		else 
		{
			System.out.println("value of a is not same for two objects");
		}
		System.out.println(op.hashCode());
		System.out.println(op2.hashCode());
	}
	
}
