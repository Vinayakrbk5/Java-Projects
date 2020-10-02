//  if we used final keyword with variable we cannot change it's value it's value remains constant

package FinalAndFinallyUsage;

/*final*/ public class FinalKeywordwithVariable { // using final class we cannot inherit in child class
	final int a=10;
	final static int b=20;
	public static void main(String[] args) {
		final int x=100;
//		static int p=10;  //static var are not allowed in any methods or blocks bcz static is used to declare as global variable 
//							so it is not possible in methods or blocks
		System.out.println(x);
		x++;
		System.out.println(x);
		FinalKeywordwithVariable obj=new FinalKeywordwithVariable();
		System.out.println(b);
		System.out.println(obj.a);
		//b=b+1;
		//obj.a=obj.a+10;
		System.out.println(b);
		System.out.println(obj.a);
	}

}
