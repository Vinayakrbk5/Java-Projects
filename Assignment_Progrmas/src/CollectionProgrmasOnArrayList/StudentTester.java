package CollectionProgrmasOnArrayList;

import java.util.ArrayList;

public class StudentTester {
	public static void main(String[] args) {
		ArrayList<Student> obj=new ArrayList();
		Student st1=new Student(10,"Vinayak");
		Student st2=new Student(11,"vishal");
		Student st3 =new Student(12,"Vivek");
		Student st4=new Student(13,"Vihan");
		Student st5=new Student(14,"Vikas");
		
		Student st7=new Student(25,"Sharath");
		
		System.out.println(obj);
		obj.add(st1);
		obj.add(st2);
		obj.add(st3);
		obj.add(st4);
		obj.add(st5);
		System.out.println(obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("--------------------------------");
		for(Student i:obj)
		{
			System.out.println(i);
		}
		System.out.println("-------------------------------");
		obj.set(2, st7);
		for (Student i:obj)
		{
		System.out.println(i);
		}
		obj.remove(4);
		System.out.println("---------------------------------");
		for (Student i:obj)
		{
			System.out.println(i);
		}
	}

}
