package FunctionalInterface;

public class StudentTester {
	public static void main(String[] args) {
		StudentWithNoArgumnetFI stno=()->"Hello World";
		System.out.println(stno.printHello());
		
		StudentWithOneArgumnetFI stone=(a)->a+5;
		System.out.println("The number after incremented by 5 is :"+stone.incrementByFive(78));
		
		StudentWithTwoArgumentFI sttwo=(a,b)->a+b;
		System.out.println("Resulting String is :"+sttwo.concatTwoStrings("Vinayak ", "Bhilawadi"));
	}

}
