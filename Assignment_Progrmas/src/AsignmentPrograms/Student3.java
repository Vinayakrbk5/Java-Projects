package AsignmentPrograms;

public class Student3 extends Students {   // inheriting properties of base class Students()  using extends keyword
	String name; // instance variable declaration

	Student3(String name)   // parametric constructor definition
	{
		this.name=name;
	}

	public void aver() // method dull() definition
	{
		System.out.println(name + " is an Average student");
	}

	public static void main(String[] args) {
		Student3 stud3 = new Student3("Shashidhar"); // object is created

		stud3.marks_history = 100;
		stud3.marks_maths =100;
		stud3.marks_science = 100;

		stud3.aver(); // calling dull method()

		System.out.println(stud3.name + " has scored " + stud3.marks_history + " in History, " + stud3.marks_maths
				+ " in Mathematics and " + stud3.marks_science + " in Science");

	}

}
