
public class MethodEg {

	public static void main(String[] args) {
		int a=10,b=20;
		//int b=20;
		SumofTwo(a,b);
		System.out.println();
		
		int x=30,y=40;
		//int y=40;
		SumofTwo(x,y);
		System.out.println();
		
		int p=50,q=60;
		//int q=60;
		SumofTwo(p,q);
		System.out.println();

	}
	public static void SumofTwo(int a,int b)
	{
		int sum=a+b;
		System.out.println("The sum of "+a+" and "+b+ " is : "+sum);
		int sub=b-a;
		System.out.println("The difference of "+b+" and "+a+ " is : "+sub);
	}

}
