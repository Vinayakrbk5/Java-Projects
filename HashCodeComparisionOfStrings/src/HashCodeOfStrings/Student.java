package HashCodeOfStrings;

public class Student {
	String str1;
	static String str2;
	public Student(String s1,String s2)
	{
		str1=s1;
		str2=s2;
	}
	public static boolean com()
	{
		Student st2=new Student("Vinayak","Vinayak");
		System.out.println("HashCode of String1 :"+st2.str1.hashCode());
		System.out.println("HashCode of String2 :"+str2.hashCode());
		return st2.str1.hashCode()==str2.hashCode();
	}
	
	public static void main(String[] args) {
		//Student st=new Student("Vinayak","Vinayak");
		System.out.println("Two Strings are equal:"+com());
		System.out.println(str2);
		
	}

}
