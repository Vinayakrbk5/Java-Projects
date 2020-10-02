package StringClassPackageEx;

public class StringEx1 {
	public static void main(String[] args) {
		StringEx1 obj=new StringEx1();
		StringEx1 obj1=new StringEx1();
		
		if(obj.equals(obj1))
		{
			System.out.println("Both objects are equal");
		}
		else
		{
			System.out.println("Both objects are not equal");
		}
		if(obj==obj1)
		{
			System.out.println("Both objects are equal");
		}
		else
		{
			System.out.println("Both objects are not equal");
		}
		
		System.out.println("-------------------------");
		String str="Vinayak";
		String str1="Vinayak";
		String s=new String("Vinayak");
		String s1=new String("Vinayak");
		if(str.equals(str1))
		{
			System.out.println("Both strings str and str1 are equal");
		}
		else
		{
			System.out.println("Both strings  str and str1 are not equal");
		}
		if(str==str1)
		{
			System.out.println("Both strings str and str1 are equal");
		}
		else
		{
			System.out.println("Both strings str and str1 are not equal");
		}
		System.out.println("--------------------------");
		if(s.equals(s1))
		{
			System.out.println("Both strings  s and s1 are equal");
		}
		else
		{
			System.out.println("Both strings  s and s1 are not equal");
		}
		if(s==s1)
		{
			System.out.println("Both strings  s and s1 are equal");
		}
		else
		{
			System.out.println("Both strings  s and s1 are not equal");
		}
	}

}
