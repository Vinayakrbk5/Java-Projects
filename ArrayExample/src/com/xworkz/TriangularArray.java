package com.xworkz;

public class TriangularArray {

	public static void main(String[] args) {
      int[][] arr=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
      int [][] newarr=new int[arr.length][arr.length];
      
      System.out.println("Displaying an old array");
      
      for (int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<arr.length;j++)
    	  {
    		  System.out.print(arr[i][j]+"  ");   // displaying an old array
    	  }
    	  System.out.println();
      }
      
      for (int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<newarr.length;j++)
    	  {
    		  newarr[i][j]=arr[i][j];      //copying one array to another array    
    	  }
      }
      
      System.out.println("displaying the copied array");
      for (int i=0;i<newarr.length;i++)
      {
    	  for(int j=0;j<newarr.length;j++)
    	  {
    		  System.out.print(newarr[i][j]+"  ");   // displaying a new array
    	  }
    	  System.out.println();
      }
      System.out.println("--------------------------------");
      
      System.out.println("printing an array in trinagular form one ");
      for(int i=0;i<arr.length;i++)
      {
    	  
    		  for(int p=0;p<i;p++) {
    			  System.out.print("   ");
    		  }								// displaying arrya in triangular shape
    		  								//    in this form		  * * *	
        	  for(int j=i;j<arr.length;j++) {       	//			    * *
        		  										//				  *
    		  System.out.print(arr[i][j]+"  ");  
    	  }																					
    	  System.out.println();
      }
      System.out.println("------------------------------------");
      System.out.println("printing an array in trinagular form Two");;
      int p=arr.length;
      for (int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<p;j++)
    	  {
    		  System.out.print(arr[i][j]+"  ");  //displaying an array in  * * *
    	  }                           				//	this form		   * *
    	  System.out.println();						//					   *
    	  p--;
      }
      System.out.println("----------------------------------------");
      System.out.println("printing an array in trinagular form Three");
      for (int i=0;i<arr.length;i++)	//displaying an array in
      {									//in this form        *
    	  for(int j=0;j<=i;j++)			//					  * *
    	  {								//					  * * * 
    		  System.out.print(arr[i][j]+"  ");
    	  }
    	  System.out.println();
      }
      int y=arr.length;
      System.out.println("------------------------------------------");
      System.out.println("printing an array in trinagular form Four");
      for(int i=0;i<arr.length;i++)
      {
    	  for( int x=0;x<y-1;x++)		//displaying an array in
    	  {								//in this form        *
    		 System.out.print("   ");	//                  * *
    	  }								//				  * * *
    	  for (int j=y-1;j<arr.length;j++)
    	  {
    		  System.out.print(arr[i][j]+"  ");
    	  }
    	  System.out.println();
    	  y--;
      }
	}
}

