// 3). Write a custom Exception of Run time exception 
// 	   and write a program to indicate an exception condition and handle it 

package teston25thapril;

public class ExceptionClassTester{
	public static void main(String[] args) {
			try
			{
			for(int i=1;i<=10;i++) {
				if(i==5)
				{
					throw  new MathException();
				}
				else {
					System.out.println("6 * "+i+" = "+(i*6));
				}
			}
			}
			catch(MathException e)
			{
				System.out.println("This is "+e+" Exception created by the user ");
			}
		
	}

}
