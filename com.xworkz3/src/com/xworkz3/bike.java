package com.xworkz3;

public class bike {
	public static void main(String[] args) 
	{
	int[][] arr=new int[2][];
    arr[0]=new int[]{1,2,3,4};
    arr[1]=new int[]{11,22};
    int j;
    int length=arr.length;
	int length1=arr[0].length;
	int length2=arr[1].length;
	System.out.println(length);
	for(int i=0; i<arr.length;i++)
	{
		for(j=0;j<length1;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
		j=length2;
	}
}
}
