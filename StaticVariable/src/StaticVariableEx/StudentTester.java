package StaticVariableEx;

public class StudentTester {
	public static void main(String[] args) {
		Student stud=new Student();
		stud.name="Vinayak";
		stud.rollNo=25;
		System.out.println(" Student name: "+stud.name+" and  Roll no: "+stud.rollNo);
		System.out.println("College name is :"+Student.college);
		Student.college="R V College";
		System.out.println("College name is :"+Student.college);
	}

}
