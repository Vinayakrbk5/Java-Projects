package AsignmentPrograms;

public class Student1 extends Students {  // inheriting properties of base class Students()  using extends keyword
	String name; 
	
	Student1(String name)
	{
		this.name=name;
	}
	public void bright()
	{
		System.out.println( name +" is bright student");
	}

	public static void main(String[] args) {
	
		Student1 stud1=new Student1("Sharath");
		
		stud1.bright();   //   calling method bright()
		
		stud1.marks_history=85;
		stud1.marks_maths=95;
		stud1.marks_science=90;
		
		System.out.println(stud1.name+ " has scored "+stud1.marks_history+" in History, "
		+stud1.marks_maths+" in Mathematics and "+stud1.marks_science+" in Science");
	}

}
