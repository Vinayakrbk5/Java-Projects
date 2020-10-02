package Arrays;

public class TwoArraysComparision {
	public static void main(String[] args) {
		int arrayone[]= {2,5,9,7,4};
		int arraytwo[]= {2,5,1,7,4};
		int n=0;
		int length=arrayone.length;
		for(int i=0;i<length;i++)
		{
			if(arrayone[i]!=arraytwo[i])
			{
				n=1;
				break;
			}
		}
		
		if(n==1)
		{
			System.out.println("The given two arrays are not equal");
		}
		else
		{
			System.out.println("The given two arrays are equal");	
		}
	}

}
