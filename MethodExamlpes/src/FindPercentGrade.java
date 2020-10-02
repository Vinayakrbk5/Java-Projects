
public class FindPercentGrade {

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
		System.out.println();
		
		System.out.println("Printing Akash's grade");
		char akashgrade='A';
		String name=FindPercentageGradeSwitch(akashgrade);
		System.out.println("Akash's percentage is :"+name);
		
		
	}
	public static void FindPercentageGrade(char grade)

	{
		System.out.println("Start of the FindPercentageGrade method");
		switch(grade)       //using switch without return statements
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
	public static String FindPercentageGradeSwitch(char grade)

	{
		String str;
		System.out.println("Start of the FindPercentageGrade method");
		switch(grade)       //switch statement using return  result
		{
		case 'A':  str="the percentage is 95-100";
                   break;
        case 'B': str="the percentage is 85-94"; 
                   break;
        case 'C': str="the percentage is 65-84"; 
                   break;
        default:  str="the percentage is below 65";         
		}
		return str;      //here returning str
}
}

