package MethodExamples;

public class DisplayJaggedArrayUsingMethods {

	public static void main(String[] args) {
	int[][] jag=new int[][] {{11,13,17,19},{20,22,24},{55,75}};
	System.out.println("displaying the jagged array");
	display(jag);
	}
	public static void display(int input[][])
	{
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input[0].length;j++)
			{
				System.out.print(input[i][j]+"  ");
			}
			i++;
			System.out.println();
			for(int x=0;x<input[1].length;x++)
			{
				System.out.print(input[i][x]+"  ");
			}
			i++;
			System.out.println();
			for(int y=0;y<input[2].length;y++)
			{
				System.out.print(input[i][y]+"  ");
			}
			i++;
		}
	}

}
