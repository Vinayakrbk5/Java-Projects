package MethodExamples;

public class ArraysInMethod {
	ArraysInMethod()
	{
		System.out.println("Printing an array elements");
	}
	
    public static void display( int[] print)
    {
    	for (int i=0;i<print.length;i++)
    	{
    		
    		 System.out.print(print[i]+" ");
    	}
    }
    	public static int[] reversearray(int[] input)
    	{
    		int[] rev=new int[input.length]; 
    		for (int i=0, j=input.length-1;i<input.length;i++,j--)
    		{
    			rev[j]=input[i];
    		}
    		return rev;
    	}
	public static void main(String[] args) {
		int [] arr=new int[] {1,2,3,4,5,6};
		System.out.println("printing an array elements");
		display(arr);
		System.out.println();
		System.out.println("printing an array elements in reversed form");
		int[] revarr=new int[arr.length];
        revarr=reversearray(arr);
		display(revarr);
		
	}

}
