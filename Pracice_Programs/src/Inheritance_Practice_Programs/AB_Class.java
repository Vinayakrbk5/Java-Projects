package Inheritance_Practice_Programs;

public class AB_Class extends B_Class{
	int c=60;
	{
		System.out.println(super.b);
	}
	{
		super.print_c();
	}
	public void print_c()
	{
		System.out.println("The value of ab is 2000");
	}

	public static void main(String[] args) {
		AB_Class ab=new AB_Classs();
		A_Class a_a=new A_Class();
		B_Class b_b=new B_Class();
		
		System.out.println(ab.c);
		
		System.out.println("-----------");
		System.out.println(a_a.a);
		System.out.println("--------------------------------");
		System.out.println(b_b.b);
		ab.print_c();
	}

}
