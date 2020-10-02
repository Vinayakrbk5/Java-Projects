package ArrayOfObjects;

public class CopyingArray {

	public static void main(String[] args) {
	
		int arr[]=new int[] {1,2,3,4,5,6};
		int newarr[]=new int[arr.length];
		System.out.println("displaying an old array");
		for(int c:arr)
		{
			System.out.print(c+", ");
		}
		System.out.println();
		newarr=arr;
		System.out.println("displaying a new array");
		for (int x:newarr)
		{
			System.out.print(x+", ");
		}
	}

}
