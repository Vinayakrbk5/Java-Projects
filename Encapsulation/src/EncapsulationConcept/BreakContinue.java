package EncapsulationConcept;

public class BreakContinue {

	public static void main(String[] args) {
	String[] subjects={"Kannada","Mathematics","Social Science", "Zoology","Botony","Accountancy","Bussiness Study"};
	for (int i=0;i<subjects.length;i++)
	{
		System.out.println(subjects[i]);
		if (subjects[i]=="Social Science")
		{
			continue;
		}
		else if(subjects[i]=="Botony")
		{
			break;
		}
	}
	}

}
