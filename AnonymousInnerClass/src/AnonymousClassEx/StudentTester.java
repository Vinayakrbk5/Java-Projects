package AnonymousClassEx;

import java.util.ArrayList;

public class StudentTester // implements Student
{
	public void studMethod()
	{
		Student st= new Student()
				{
					public void display()
					{
						System.out.println("This is StudentTester Class");
					}
				};
				
				st.display();
	}
	public static void main(String[] args) {
		
		ArrayList<Student> arrlist=new ArrayList<>();
		
		StudentTester stTest=new StudentTester();
		Student
		stTest.studMethod();
	}

}
