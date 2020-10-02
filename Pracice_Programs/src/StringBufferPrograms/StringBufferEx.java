package StringBufferPrograms;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer obj=new StringBuffer("Vinayak");
		StringBuffer obj2=new StringBuffer("Bhilawadi");
		String str=new  String("Rabkavi");
		String str2="Karnataka";
		System.out.println(obj.append(str2));
		obj=obj2;
		System.out.println(obj);
		str=str2;
		System.out.println(str);
	}
	

}
