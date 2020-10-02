// Jagged Array is a
// is a multidimensional array with different number of elements in the column
package com.xworkz;

public class JaggedArrayAdding {

	public static void main(String[] args) {
	int arr[][]=new int[][] {{14,12,13,14},{34,25,35},{50,90}};
	for (int i=0;i<arr.length;i++)
	{
		for (int j=0;j<arr[0].length;j++)
		{
			System.out.print(arr[i][j]+"   ");
		}
		i++;
		System.out.println();
		for(int x=0;x<arr[1].length;x++)
		{
			System.out.print(arr[i][x]+"   ");
		}
		i++;
		System.out.println();
		for(int y=0;y<arr[2].length;y++)
		{
			System.out.print(arr[i][y]+"   ");
		}
		i++;
	}
	
	}

}
