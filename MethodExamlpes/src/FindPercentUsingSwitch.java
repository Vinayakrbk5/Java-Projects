
public class FindPercentUsingSwitch {

	public static void main(String[] args) {

		System.out.println("The program  to find the percentage grade");
		System.out.println();
		
		System.out.println("Printing Rahul's grade ");
		char rahulgrade='A';
		FindPercentageGrade(rahulgrade);
		System.out.println();
		
		System.out.println("Printing Raghu's grade ");
		char raghugrade='B';
		FindPercentageGrade(raghugrade);
		System.out.println();
		
		System.out.println("Printing Nitin's grade ");
		char nitingrade='C';
		FindPercentageGrade(nitingrade);
		
		
	}
	public static String FindPercentageGrade(char grade)

	{
		System.out.println("Start of the FindPercentageGrade method");
		switch(grade)
		{
		case 'A': System.out.println("the percentage is 95-100");
		          break;
		case 'B': System.out.println("the percentage is 85-94"); 
		          break;
		case 'C': System.out.println("the percentage is 65-84"); 
		          break;
		default:System.out.println("the percentage is below 65");          
		}
		System.out.println("End of the FindPercentageGrade method");
	}
}

		// TODO Auto-generated method stub

	}

}
