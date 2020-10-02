package FunctionalInterface;

public class StudentTesterClass2 {
	public static void main(String[] args) {
//		Student2<Double,Integer> st2=(a,b)->(int)(a+b);
//		System.out.println(st2.mul(20.87, 15.43));
//		
//		Student2<Integer,Double> std=(a,b)->(double)a/b;
//		System.out.println(std.mul(20, 19));
		
		Student2 str=(a,b)->a/b;
		System.out.println(str.mul(20.98, 19));
	}

}
