package StringClassPackage;

public class StringClassMethod {
	public static void main(String[] args) {
		String str=new String("Welcome Home");
		System.out.println(str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.toCharArray());
		char ch[]=str.toCharArray();
		for(char i:ch)
		{
			System.out.println(i);
		}
		System.out.println(str.endsWith(str));
		System.out.println(str.lastIndexOf('m'));
		System.out.println(str.charAt(5));
		System.out.println(str.isEmpty());
		System.out.println(str.equals(arg0));
		}

}
