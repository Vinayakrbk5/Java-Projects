package ThisKeywordExample;

public class ParametricConstructor {
	
	int a;
	int b;
	int c=80;
	ParametricConstructor()
	{
		//System.out.println("The sum is :"+(a+b));
	}
	ParametricConstructor(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("The sum is :"+(a+b+c));  // taking a and b values from object creation and c from instance variable
	}
	public void sum()
	{
		System.out.println("The sum of two numbers is :"+(a+b));
	}

	public static void main(String[] args) {
	
		ParametricConstructor obj=new ParametricConstructor();
		ParametricConstructor obj1=new ParametricConstructor(10,20);
		
		obj.a=50;
		obj.b=100;
		//obj.a=30;
		//obj.b=70;
		obj.sum();
	}

}
