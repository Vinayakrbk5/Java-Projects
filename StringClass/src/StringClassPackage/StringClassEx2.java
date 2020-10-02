package StringClassPackage;public class StringClassEx2 {
	public static void main(String[] args) {
		StringClassEx2 obj=new StringClassEx2();
		
		String s="Vinayak";
		String s1="Vinayak";
		char[ ] c= {'a','b','c'};
		String str4=new String(c);
		System.out.println(c);
		System.out.println(obj);
		System.out.println(obj.toString());
		String str=new String("Welcome");
		String str1=new String("Welcome");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println(str==str1);
		System.out.println(str.toString());
		String str7=new String();
		String s4="Vinayak";
		String s5="4";
//		String s6=s4*s5;
		System.out.println(s6);
	}

}