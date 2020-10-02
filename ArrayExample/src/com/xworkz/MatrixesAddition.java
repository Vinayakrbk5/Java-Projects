package com.xworkz;

public class MatrixesAddition {

	public static void main(String[] args) {
      int [][] matrix1=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
      int [][] matrix2=new int[][] {{11,22,33},{44,55,66},{77,88,99}};
      int length=matrix1.length;
      int [][] matrixsum=new int[length][length];
      for (int i=0;i<length;i++)
      {
    	  for(int j=0; j<length;j++)
    	  {
    		  matrixsum[i][j]=matrix1[i][j]+matrix2[i][j];
    	  }
      }
      System.out.println("displaying matrix1 elements");
      for (int i=0;i<length;i++)
      {
    	  for(int j=0; j<length;j++)
    	  {
    		  System.out.print(matrix1[i][j]+" ");
    	  }
    	  System.out.println();
      }
      System.out.println();
      System.out.println("displaying matrix2 elements");
      for (int i=0;i<length;i++)
      {
    	  for(int j=0; j<length;j++)
    	  {
    		  System.out.print(matrix2[i][j]+" ");
    	  }
    	  System.out.println();
      }
      System.out.println();
      System.out.println("displaying sum of matrix1 and matrix2 elements");
      for (int i=0;i<length;i++)
      {
    	  for(int j=0; j<length;j++)
    	  {
    		  System.out.print(matrixsum[i][j]+" ");
    	  }
    	  System.out.println();
      }
	}

}
