package Arrays;

public class DisplayNumbersInSumFormat {
public static void main(String[] args) {
	for(int i=1;i<=6;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
			if(j==i)
			{
				break;
			}
			System.out.print("+");
		}
		
		System.out.println();
	}
}
}

