package WrapperClassPrograms;

import java.util.ArrayList;

public class WrapperClassEx2 {
	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		int i=20;
		Integer obji=new Integer(i);   // converting from primitive type to wrapper Class type
		System.out.println(i);
		System.out.println(obji);
		
		int j=obji.intValue();       // converting from wrapper class type to primitive type using inbuilt methods like intvalue() etc
		System.out.println(j);
	}

}
