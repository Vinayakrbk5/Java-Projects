package StaticMethod;

public class Student {

	 int rollNo=0;
	String name;
	static String college="National College";
	Student(String name)
	{
		this.name=name;
		method1();
	}
	 void method1()
	{
		rollNo++;
	}
}
