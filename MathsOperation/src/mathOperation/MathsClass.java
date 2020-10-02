package mathOperation;

public class MathsClass implements MathInterface{

	public MathsClass()
	{
		System.out.println("This is Constructor");
	}
	
	@Override
	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	public void display()
	{
		System.out.println("This is Display method");
	}
	public static void main(String[] args) {
		MathInterface obj=new MathsClass();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.mul(25, 35));
	}

}
