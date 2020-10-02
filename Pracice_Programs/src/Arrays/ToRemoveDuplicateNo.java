package Arrays;

public class ToRemoveDuplicateNo {
	public static void main(String[] args) {
		int[] arr=new int[] {2,4,7,3,2,8,4,7};
		int[] arr2=new int[arr.length];
		arr2=display(arr);
		for(int i:arr2)
		{
			System.out.print(i+" ");
		}
		
	}
	public static int[] display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i!=j)
				{
					if(a[i]==a[j])
					{
						a[j]=0;
					}
				}
			}
		}
		return a;
	}

}
