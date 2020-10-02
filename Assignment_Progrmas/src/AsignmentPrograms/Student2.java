package AsignmentPrograms;

public class Student2  extends Students{  // inheriting properties of base class Students()  using extends keyword
	String name;      //  instance variable declaration
	
	Student2(String name)   // parametric constructor definition
	{
		this.name=name;
	}
	
	public void dull()   // method dull() definition
	{
		System.out.println(name+" is a dull student");
	}

	public static void main(String[] args) {
	 Student2 stud2 =new Student2("Madavan");   // object is created
	 
	 stud2.marks_history=79;
	 stud2.marks_maths=75;
	 stud2.marks_science=90;
	 
	 stud2.dull();  // calling dull method()
	 
	 System.out.println(stud2.name+ " has scored "+stud2.marks_history+" in History, "
				+stud2.marks_maths+" in Mathematics and "+stud2.marks_science+" in Science");
	 
	}

}
