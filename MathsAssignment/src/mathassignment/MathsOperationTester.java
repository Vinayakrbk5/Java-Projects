package mathassignment;

import mathOperation.Mathsclass;

public class MathsOperationTester {
	public static void main(String[] args) {
		int a=10,b=20;
		Mathsclass obj=new Mathsclass();
		System.out.println(obj.sum(a,b));
		System.out.println(obj.mul(a, b));
	}

}
