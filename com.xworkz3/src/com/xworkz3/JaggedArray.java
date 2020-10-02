package com.xworkz3;

public class JaggedArray {

	public static void main(String[] args) {
     int [][] array=new int[][] {{1,2},{6,7,8},{4,5,6,7}};
     int length=array.length;
    // array[0]= {1,2};
     //array[1]= {6,7,8};
     //array[2]= {4,5,6,7};
     int length1=array[0].length;
     int length2=array[1].length;
     int length3=array[2].length;
     System.out.println("The printing the Jagged Array");
     for (int i=0;i<length;) {
    	 {
    	for (int j=0;j<length1;j++)
    	{
    	System.out.print(array[i][j]+" ");	
    	}
    	System.out.println();
    	//break;
    	i++;
    	 }
    	 for(int x=0; x<length2;x++)
    	 {
    		 System.out.print(array[i][x]+" ");
    	 }
    	 System.out.println();
    	 i=i+1;
    	// break;
    	 for( int y=0;y<length3;y++)
    	 {
    		 System.out.print(array[i][y]+" "); 
    	 }
    	 i=i+1;
    	// break;
     }
	}

}
