package MethodExamples;

public class DoubleArrayDisplay {

	public static void main(String[] args) {
    double[] doublearr=new double[] {11.43, 34.54, 15.23, 55.64, 56.23};
    double sumarray=0;
    double revarr[]=new double[doublearr.length];
    
    System.out.println("displaying an old array");
    display(doublearr);   //calling display() method
    System.out.println();
    System.out.println();
    
    System.out.println("displaying the reversed array");
    revarr=reverse(doublearr);  // calling reverse() method
    display(revarr);
    System.out.println();//  calling display() method
    
    System.out.println();
    sumarray=sum(doublearr);  //calling sum method
    System.out.println();
	System.out.println("The sum of elements of double array is : "+sumarray);
    
	}
	public static void display(double input[]) {
		for (int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+"  ");
		}
	}
	public static double sum(double input[])
	{
		double sum=0;
		for(int i=0;i<input.length;i++)
		{
		sum+=input[i];	
		}
		return sum;
	}
	public static double[] reverse(double input[])
	{
		double rev[]=new double[input.length];
		for (int i=0, j=input.length-1; i<input.length & j>=0; i++,j--)
		{
			rev[j]=input[i];
		}
		return rev;
	}
	

}

