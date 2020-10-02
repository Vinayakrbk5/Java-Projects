package com.xworkz;

public class AssignmentOnArray3 {

	public static void main(String[] args) {
		int array[]= {2,7,11,12,19,8,6,17};
		int [] oddarray=new int[5];
		int[] evenarray=new int[5];
		int length=array.length;
		int p=0,q=0;
		for(int i=0;i<length;i++)
		{
			if((array[i]%2)==0) {
				evenarray[p]=array[i];
				p++;
			}else
			{
				oddarray[q]=array[i];
				q++;
			}
		}
	int length1=evenarray.length;
	int length2=oddarray.length;
	System.out.println("Even numbers in the array are:");
	for(int x:evenarray)
	{System.out.println(x);

	}
	System.out.println("------------------------------");
	System.out.println("The Odd Numbers in the array are:");
	for (int y:oddarray)
	{
		System.out.println(y);
	}
	/*for (int z=0;z<length1;z++)
	{
		System.out.println(evenarray[z]);
	}*/

}
}