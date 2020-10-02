package PracticalProgramsClass;

//import java.util.Scanner;

public class ToFindPairNumberInArray {
	public static void main(String[] args) {
		int a[]=new int[] {1,5,3,4,7,6,-1,2};
		//int arr[];
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter the number to compare");
		int n=6;
		/*for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.print("["+a[i]+","+a[j]+"]"+" ");
				}
			}
		}*/
		numarr(a,n);
	}
	public static void numarr(int[] a,int n)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
				{
					System.out.print("["+a[i]+","+a[j]+"]"+" ");
				}
			}
	}

}
}
