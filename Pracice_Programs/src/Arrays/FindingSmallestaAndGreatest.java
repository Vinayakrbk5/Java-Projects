package Arrays;

public class FindingSmallestaAndGreatest {
	public static int[] sort(int[] a)
	{
		int temp=0;
		for (int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			if(a[j]>a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		return a;

	}

	public static void main(String[] args) {

		int [] arr= {20,19,5,10,80,38};
		int[] newarr=new int[arr.length];
		newarr=sort(arr);
		System.out.println("Smallest element in the array is : "+newarr[0]);
		System.out.println("Smallest element in the array is : "+newarr[newarr.length-1]);
		
	}

}
