package StringBuilderEx;

public class StringBuilderProg {
	public static void main(String[] args) {
		StringBuilder obj=new StringBuilder("Vinayak");
		String obj2=new String("Vinayak");
		System.out.println(obj.delete(1, 2));  // delete(n,s)  it removes s characters and inserts n characters in StrinBuilders
		System.out.println(obj2.substring(1, 2));  // substring(n s)  it selects s characters and removes n characters in Strings
		char[] ch= {'A','B','C'};
		String str=new String(ch);
		System.out.println(str);
	}

}
