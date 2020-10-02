
public class FindingVowels {

	public static void main(String[] args) {
	char[] arr=new char[] {'V','I','N','A','Y','A','K'};
	char[] newarr=new char[] {'W','E','L','C','O','C','E'};
	System.out.println("using switch statement");
	for (char c:arr)
	{
		switch(c)
		{
		case 'A':
			System.out.println("The given charecter "+c+" is a vowel");
			break;
			
		case 'E':
			System.out.println("The given charecter "+c+" is a vowel");
			break;
			
		case 'I':
			System.out.println("The given charecter "+c+" is a vowel");
			break;
			
		case 'O':
			System.out.println("The given charecter "+c+" is a vowel");
			break;
			
		case 'U':
			System.out.println("The given charecter "+c+" is a vowel");
			break;
		
		default:System.out.println("The given charecter "+c+" is not a vowel");
		break;
		}
	}
	System.out.println("------------------------------------");
	System.out.println("using if statment");
	for(char m:newarr)
	{
		if(m=='A'||m=='E'||m=='I'||m=='O'||m=='U')
		{
			System.out.println("The given charecter "+m+" is a vowel");
		}
		else
		{
			System.out.println("The given charecter "+m+" is not a vowel");
		}
	}
	}

}
