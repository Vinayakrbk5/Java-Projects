package ObjectClass;

public class ReturningClassObject {
	public static void main(String[] args) {
		Object obj=getMethod("HashCode");
		System.out.println(obj);
//		System.out.println(getMethod());
	}
	public static  Object getMethod(Object x)
	{
		if(x.equals("HashCode"))
		{
			return new HashCode();
		}
		else
		{
			return null;
		}
	}
}
