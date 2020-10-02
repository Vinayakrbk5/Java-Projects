package StringClassPackageEx;

public class StringEx2 {
	public static void main(String[] args) {
		String str="Vinayak";
		String str1="Vinayak";
		String s=new String("C:http/Vinayak/Bhilawadi/");
		String s1=new String("Vinayak");
		System.out.println(s.compareTo("Vinayak")); // differencing two askii values and giving result some integer
		System.out.println(s.endsWith("Bhilawadi"));
		System.out.println(s.contains(s1));
		System.out.println(s.hashCode());
		System.out.println(str==s1);
		System.out.println(s.isEmpty());
		System.out.println(s.lastIndexOf('n'));
		System.out.println("Matches :"+str.matches(s));  //  comparing both values
		System.out.println(s.replace('V','S'));
		System.out.println(s.substring(3));  // removes 1st 3 characters 
		System.out.println(s.substring(3, 5)); // removes 1st 3 character from selected 5 characters
		System.out.println(s.toCharArray());
		char[] arr=s.toCharArray();
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.trim());
		System.out.println("----------------");
		System.out.println(s.split("/",2));
		
	}
}
