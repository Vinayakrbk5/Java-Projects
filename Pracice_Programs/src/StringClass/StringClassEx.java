package StringClass;

public class StringClassEx {
	int a;
	public static void main(String[] args) {
		String s="Wel Come";
		String s1="India";
		String str=new String("India");
		String str1=new String("India");
		String name=new String("Vinayak");
		String name1=new String("vinayak").intern();
		System.out.println(s1);
		System.out.println(s);
		System.out.println(s.concat(s1));
		System.out.println("==================");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		System.out.println("==================");
		System.out.println("Equals of str and str1 is "+str.equals(str1));
		System.out.println("== of str and str1 is "+(str==str1));
		
		System.out.println("==================");
		StringClassEx obj1=new StringClassEx();
		StringClassEx obj2=new StringClassEx();
		
		System.out.println("Comapare to of str and str1 is "+str.compareTo(str1));
		System.out.println("Matches of str and str1 is "+str.matches(str1));
		System.out.println("contentEquals of str and s1 is "+str.contentEquals(s1));
		System.out.println("contains of str and str1 is "+str.contains(str1));
		System.out.println("endsWith of str and s1 is "+str.endsWith(s1));
		System.out.println("Equals of name and name1 is "+name.equals(name1));
		System.out.println("equalsIgnoreCase of name and name1 is "+name.equalsIgnoreCase(name1));
		System.out.println("LastIndex is "+name.lastIndexOf('n'));
		System.out.println("replace function "+name.replace('n','s'));
		char nam[]=name.toCharArray();
		for (char i:nam) {
		System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("lenth of char array "+nam.length);
		System.out.println("Length of string "+name.length());
		for(int i=0;i<nam.length;i++)
		{
			System.out.print(nam[i]+" ");
		}
		System.out.println();
		System.out.println(s.format(name, str1));
		System.out.println(s.intern());
		String nat="          http:/www/google/vinayak/bhilawadi         ";
		System.out.println(nat.trim());
		System.out.println(s1==name1);
		String st[]=nat.split("/",3);
		System.out.println("===========================");
		for(String i:st)
		{
			System.out.println(i+"  ");
		}
		System.out.println(name.substring(2,5));       // name.subString(int arg(n)  it removes first n character and prints
		System.out.println("Substring="+name.substring(2));   // name.substring(int arg(n),int arg(s)) it prints first s charectors and removes first n charector
	
	String dis=String.format('c'+"%f",167262f);
	System.out.println("formatted string is "+dis);
	}
}
