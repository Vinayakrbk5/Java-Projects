package FunctionalInterfaceWithDifferentNumberOfArguments;

public class StudentTesterWithArguments {
	public static void main(String[] args) {
		StudentWithNoArgumnetFI stno=()->System.out.println("This is No Argument Functional Interface");
		stno.print();
		
		StudentWithOneArgumentFI stone=(a)->"he is "+a+" years old";
		System.out.println(stone.display(25));
		
		StudentWithTwoArgumentFI sttwo=(a,b)->a*b;
		System.out.println("Result is :"+sttwo.sum(29, 35.87));
	}

}
