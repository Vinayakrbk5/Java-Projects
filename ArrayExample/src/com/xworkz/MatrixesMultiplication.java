package com.xworkz;

public class MatrixesMultiplication {

	public static void main(String[] args) {
		int [][] matrix1=new int[][] {{1,2},{4,5}};//,{7,8,9}};
	      int [][] matrix2=new int[][] {{2,4},{1,3}};//,{1,2,3}};
	      int length=matrix1.length;
	      int [][] matrixmul=new int[length][length];
	      for (int i=0;i<length;i++)
	      {
	    	  for (int j=0;j<length;j++)
	    	  {
	    		  for(int k=0;k<length;k++)
	    		  {
	    			  matrixmul[i][j]=matrixmul[i][j]+matrix1[i][k]*matrix2[k][j];
	    		  }
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
	      System.out.println("displaying Multiplication of matrix1 and matrix2 elements");
	      for (int i=0;i<length;i++)
	      {
	    	  for(int j=0; j<length;j++)
	    	  {
	    		  System.out.print(matrixmul[i][j]+"  ");
	    	  }
	    	  System.out.println();
	      }
	}
}
