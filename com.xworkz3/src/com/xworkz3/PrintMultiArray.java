package com.xworkz3;

public class PrintMultiArray {

	public static void main(String[] args) {
		int oddnum[][]= {{1,3,5},{7,9,11},{13,15,17}};
		int length=oddnum.length;
		System.out.println("The length of the array is : "+length);
		System.out.println("The Multidimensional array is :");
		
		for(int i=0;i<oddnum.length;i++)
		{
			for (int j=0;j<oddnum.length;j++)
			{
				System.out.print(oddnum[i][j]+"   ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("The first element of the array is : "+oddnum[0][0]);
		
		System.out.println();
        System.out.println("The last element of the array is : "+oddnum[length-1][length-1]);
        //int y=0;
        System.out.println();
        System.out.println("The array elements in triangular shape is : ");
        for (int x=0;x<length;x++)
        {
        	
        	for(int y=0;y<=x;y++)
        	{
        		System.out.print(oddnum[x][y]+"   ");
        	}
        	System.out.println();
        }
        System.out.println();
        System.out.println("The Diagonal array elements are : ");
        for(int p=0;p<length;p++)
        {
        	for(int q=0;q<length;q++)
        	{
        		if (p==q)
        		{
        			System.out.print(oddnum[p][q]);
        		}
        		else
        		{
        			System.out.print("     ");
        		}
        	}
        	System.out.println();
        }
	}

}
