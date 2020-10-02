package StaticMethod;

public class StudentTester {
	public static void main(String[] args) {
		System.out.println("Student details");
		Student stud=new Student("Vinayak");
		System.out.println("Student name: "+stud.name);
		System.out.println("Roll No :"+stud.rollNo);
		System.out.println("College name :"+stud.college);
		
		Student stud1=new Student("Karna");
		
		System.out.println("Student name: "+stud1.name);
		System.out.println("Roll No :"+stud1.rollNo);
		System.out.println("College name :"+stud1.college);
	}

}
