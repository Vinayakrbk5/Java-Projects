//   method overloading means method 
//   same name with different data types and different number of parameters

public class MethodOverloading {

	public static void main(String[] args) {
		int a=20,b=30;
		int addint=add(a,b);
		System.out.println("The Addition of ["+a+"]["+b+"] is : "+addint);
		double x=54.65,y=67.87;
		double adddouble=add(x,y);
		System.out.println("The Addition of ["+a+"]["+b+"] is : "+adddouble);

		System.out.println();
		
		//System.out.println("The Addition of ["+a+"]["+b+"] is : "+add(56.76,20));
		
		//System.out.println("The Addition of ["+a+"]["+b+"] is : "+add(56,20));
		System.out.println("The Addition of ["+a+"]["+b+"] is : "+add(56,20,40));
		System.out.println("The Addition of ["+a+"]["+b+"] is : "+add(70.19f,20.35f));
	}
	public static int add(int a,int b)   //add(20,30)
	{
		int  res=a+b;
		return res;
	}
	public static double add(double a,double b)   //add(54.65, 67.87)
	{
		double res=a+b;
		return res;
		}
	/*public static int add(double a,int b)
	{
		int res=a+b;
		return res;
	}*/
	/*public static double add(int a,int b)
	{
		int res=a+b;
		return res;
	}*/
	public static int add(int a,int b,int c)
	{
		int res=a+b+c;
		return res;
	}
	public static float add(float a, float b)
	{
		float res=a+b;
		return res;
	}

}
