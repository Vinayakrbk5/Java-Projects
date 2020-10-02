package StringClassPackage;

public class EquationInString {
	public static void main(String[] args) {
		String s1="Hello World";
		String s2="Hello World";
		String s3=new String("Hello World123");
		System.out.println("s1=s2 "+(s1==s2));
		System.out.println("s1.equals(s2)"+s1.equals(s2));
		System.out.println("s1==s3"+s1==s3);
		System.out.println("s1.equals(s3)"+s1.equals(s3));
		System.out.println("s1.compareTo(s2) "+s1.compareTo(s2));
		System.out.println("s1.compareTo(s2) "+s1.compareTo(s3));
		System.out.println("s1.equalsIgnoreCase(s2)"+s1.equalsIgnoreCase(s2));
		System.out.println("s1.equalsIgnoreCase(s3)"+s1.equalsIgnoreCase(s3));
		System.out.println("s1.compareToIgnoreCase(s2)"+s1.compareToIgnoreCase(s2));
		System.out.println("s1.compareToIgnoreCase(s2)"+s1.compareToIgnoreCase(s3));
		System.out.println("s1.matches(s2)"+s1.matches(s2));
		System.out.println("s1.matches(s2)"+s1.matches(s3));
		System.out.println(s1.format(s3, s2));
	}
}