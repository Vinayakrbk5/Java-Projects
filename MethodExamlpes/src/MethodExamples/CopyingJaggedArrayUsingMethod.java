package MethodExamples;

public class CopyingJaggedArrayUsingMethod {

	public static void main(String[] args) {
		int[][] jag = new int[][] { { 11, 13, 17, 19 }, { 20, 22, 24 }, { 55, 77 } };
		int[][] jaggedcopy = new int[jag.length][];

		System.out.println("displaying the jagged array");
		display(jag); // calling display() method
		System.out.println();

		jaggedcopy = copy(jag); // calling copy() method

		System.out.println("displaying the copied jagged array");
		display(jaggedcopy); // calling display() method
	}

	public static void display(int input[][]) // method to display jagged array
	{
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				System.out.print(input[i][j] + "  ");
			}
			i++;
			System.out.println();
			for (int x = 0; x < input[1].length; x++) {
				System.out.print(input[i][x] + "  ");
			}
			i++;
			System.out.println();
			for (int y = 0; y < input[2].length; y++) {
				System.out.print(input[i][y] + "  ");
			}
			i++;
		}
	}

	public static int[][] copy(int input[][]) // method to copy jagged array
	{
		int jagcopy[][] = new int[input.length][];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				System.out.println("input of ["+i+"]["+j+"]" + input[i][j]);

				jagcopy[i][j] = input[i][j];
			}
			i++;
			System.out.println();
			for (int x = 0; x < input[1].length; x++) {
				jagcopy[i][x] = input[i][x];
			}
			i++;
			System.out.println();
			for (int y = 0; y < input[2].length; y++) {
				jagcopy[i][y] = input[i][y];
			}
			i++;
		}
		return jagcopy;
	}

}
