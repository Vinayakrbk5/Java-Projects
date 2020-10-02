//  byte, short, int, long, float, double

package PremitiveTypeCasting;

public class PremitiveTypeCasting {

	public static void main(String[] args) {
	long i=252345634876576878l;
	double f=78.78;
	float j=(float)f;
	double x=i;
	long p=(long)f;
	//i=(int)x;
	System.out.println(i);
	System.out.println(x);
	System.out.println(p);
	System.out.println(f);
	System.out.println(j);
	
	int i=234;
	float f=i;
	short j=(short)(long)(int)f;
	long l=(int)(short)(long)(int)f;
	System.out.println(i);
	System.out.println(f);
	System.out.println(j);
	
	}

}
