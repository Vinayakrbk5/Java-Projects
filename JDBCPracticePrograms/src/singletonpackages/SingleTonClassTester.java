package singletonpackages;

public class SingleTonClassTester {

public static void main(String[] args) {
//	Connection conn=SingleTonClass.getInstance().getConnection();
	
	SingleTonClass singleton1=SingleTonClass.getInstance();
	SingleTonClass singleton2=SingleTonClass.getInstance();
	
	System.out.println(singleton1.hashCode());
	System.out.println(singleton2.hashCode());
	
	System.out.println("Equality: "+(singleton1==singleton2));
	
}
}
