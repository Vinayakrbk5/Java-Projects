
public class MathOperation {

	public static void main(String[] args) {
		int num1=50;
		int num2=30;
		int res1=add(num1,num2);
		int res2=Sub(num1,num2);
		System.out.println("Adding and Substraction Operation");
		System.out.println();
		System.out.println("The addition of ["+num1+"]["+num2+"] : "+res1);
		System.out.println("The Substraction  of ["+num1+"]["+num2+"] : "+res2);
		System.out.println();
        System.out.println("The End of the opration");
	}
	public static int add(int a,int b)  //add(50,30)
	{
		int result=a+b;  //50+30
		return result;   //80
	}

	public static int Sub(int a, int b)     //Sub(50,30)
	{  
		int result=a-b;     //50-30
		return result;      //20
	}
}
