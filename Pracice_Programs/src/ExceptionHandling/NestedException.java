package ExceptionHandling;

import javax.sound.midi.Synthesizer;
import javax.swing.text.NumberFormatter;

public class NestedException {
	public static void main(String[] args) {
		int a=0;
		try {
			System.out.println("Inside First try blcok");
			try {
				System.out.println("Inside second try block");
				try {
					System.out.println("Inside third try block");
					try
					{
						System.out.println("Inside Sequence Class");
						String s=args[0];
					}
					catch(NumberFormatException e){
						System.out.println("This is NumberFormat Exception ");
					}
					finally
					{
						System.out.println("Inside sequence finally block");
					}
					try {
						System.out.println("Inside fourth try block");
						a=10/0;
					}
					catch(NullPointerException e)
					{
						System.out.println("This is NullPointer Exception");
					}finally
					{
						System.out.println("Inside fourth finally block");
					}
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("This is ArrayIndexOutOfBounds Exception");
				}
				finally
				{
					System.out.println("Inside Third finally block");
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println("This is Arithmetic Exception");
			}
			finally
			{
				System.out.println("Inside second finally block");
			}
//			try {
//				System.out.println("Inside fourth try block");
//				a=10/0;
//			}
//			catch(NullPointerException e)
//			{
//				System.out.println("This is ArrayIndexOutOfBounds Exception");
//			}
		}
		catch(RuntimeException e)
		{
			System.out.println("This is Runtime Exception");
		}
		finally
		{
			System.out.println("Inside first finally block");
		}
	}

}
