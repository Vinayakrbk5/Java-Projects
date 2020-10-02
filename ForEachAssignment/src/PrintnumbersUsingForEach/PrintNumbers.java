package PrintnumbersUsingForEach;

public class PrintNumbers {

	public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6,7,8,9,10};
	System.out.println("Printing numbers except 4 and 5");
	for(int c:num)
	{
		if((c<6)&&(c>3))
		{
			continue;
		}
		System.out.println(c);
		if (c>10)
		{
			break;
		}
	}
	}

}
