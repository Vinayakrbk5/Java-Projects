package com.xworkz;

public class ReverseArray {

	public static void main(String[] args) {
    int [] arr=new int[] {11,22,33,44,55};
    int []revarr=new int[arr.length];
    int[] revarr2=new int[arr.length];
    int length=arr.length;
    for (int i=0, j=length-1,x=length-1; i<arr.length&j>=0&x>=0;i++,j--,x--)
    {
    	revarr[j]=arr[i];
    	revarr2[x]=arr[i];
    }
    System.out.println("The old array elements are : ");
    for (int i=0;i<arr.length;i++)
    {
    	System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println();
    System.out.println("printing revarr elements ");
    for (int i=0;i<revarr.length;i++)
    {
    	System.out.print(revarr[i]+" ");
    }
    System.out.println();;
    System.out.println();
    System.out.println("printing revarr2 elements ");
    for (int i=0; i<length;i++)
    {
    	System.out.print(revarr2[i]+" ");
    }
	}

}
