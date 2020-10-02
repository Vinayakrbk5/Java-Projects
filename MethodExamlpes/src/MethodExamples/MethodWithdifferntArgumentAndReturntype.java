package MethodExamples;

public class MethodWithdifferntArgumentAndReturntype {

	public static void main(String[] args) {
	int [][] arrmatrix=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	int [] arr = new int[]{11,22,33,44,55,66};
	int revarr[]=new int[arr.length];
	
	adddisplay();        // calling No Argument with No Return type method adddisplay()
	System.out.println();
	
	System.out.println("displaying the matrix elements :");
	displaymatrix(arrmatrix); //calling Argument with No return type method displaymatrix()
	System.out.println();
	
	int sum=add();   //calling No Argument with return type method add()
	System.out.println("The sum of two numbers is : "+add());
	
	System.out.println();
	revarr=reverse(arr);   //calling Argument with return type method reverse()
	
	System.out.println("The Old array is : ");
	displayarray(arr);
	
	System.out.println();
	System.out.println();
	System.out.println("The reversed array is :");
	displayarray(revarr);  // calling displayarray() method to display revarr
	}
	
	public static void adddisplay()   //   No Argument with No Return type
	{
		System.out.println("The process is to add two numbers :");
	}
	
	public static void displaymatrix(int input[][])  //   Argument with no Return type
	{
		for (int i=0;i<input.length;i++)
		{
			for (int j=0;j<input.length;j++)
			{
				System.out.print(input[i][j]+"  ");
			}
			System.out.println();
		}
	}
	
	public static int add()    //  No Argument with No Return type
	{
		int a=10,b=20;
		return a+b;
	}
	
	public static int[] reverse(int input[])   //  argument with return type
	{
		int [] array=new int[input.length];
		for (int i=0,j=input.length-1; i<input.length & j>=0; i++,j--)
		{
			array[j]=input[i];
		}
		return array;
		}
	
public static void displayarray(int input[])  // Argument with No return type to display array 
{
	for (int i=0;i<input.length;i++)
	{
		System.out.print(input[i]+"  ");
	}
}
}
