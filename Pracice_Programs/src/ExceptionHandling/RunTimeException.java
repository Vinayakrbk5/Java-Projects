package ExceptionHandling;

import java.io.IOException;

public class RunTimeException {
	int x;
	public static void main(String[] args) {
		//int a=0,b=10,sum=0;
		String a=null;
		String sum=null;
		try{
			try {
				try {
					try {
						//RunTimeException obj=null;
						//System.out.println(obj.x);
				 sum=args[0];
			    //a=Integer.parseInt(sum);
				 a=String.valueOf(sum);
						//int b=10/a;
			}
			catch(ArrayIndexOutOfBoundsException e)
				{
				System.out.println("Array is out of bound");
				throw new IOException("This is Vinayak");
				}
			}
			catch(NullPointerException e)
			{
				System.out.println("null pointer exception");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number is not in format");
		}
		}
		catch(Exception e)
		{
			System.out.println("outside try block");
		}
		finally
		{
			System.out.println("This is finally block");
		}
		System.out.println("The sum is :"+a);
	}

}
