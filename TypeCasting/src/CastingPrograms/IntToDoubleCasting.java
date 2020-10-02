package CastingPrograms;

public class IntToDoubleCasting {

	public static void main(String[] args) {

		int a=20;
		double b=(double)a;   // casting from int to double defined explicitly
		System.out.println("double value of a is :"+b);
		
		int x=35;
		double y=x;  //  casting from int to double, auto widening not defined any where explicitly
		System.out.println("double value of x is :"+y);
		
		int m=24;
		float n=m;  // casting from int to float type, auto widening
		System.out.println("double value of m is :"+n);
		
		double p=23.78;
		int q=(int)p;   // casting from
		System.out.println("integer value of p is :"+q);
		System.out.println("double value of p is :"+(double)q);
		
		double d=123.5674;
		byte z=(byte)(short)(long)(int)d;
		System.out.println("Value of d is :"+z);
		//float pq=456.45;
		short pq=65;
		System.out.println("Value of pq is :"+pq);
	}
	

}
