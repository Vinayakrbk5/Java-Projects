package DerivedCastingPrograms;

public class MathsTester {

	public static void main(String[] args) {
		
	Addition add=new Addition();
	System.out.println("i using add obj :"+add.i);  // inherited
	System.out.println("j using add obj :"+add.j);  // inherited
	System.out.println("k using add obj :"+add.k);  //defined
	
	add.MathsMethod();   // inherited
	add.OperationMethod();  // inherited
	add.AdditionMethod();  // defined
	System.out.println();
	
	Operation ops=new Addition();  // creation of object of Opertation() class using Addition() Class 
//  Operation ops=(Opeartion) add;
//  Operation ops=(Operattion) new Additon();      //   all are allowed for up casting
//  Operation ops=add;	

	System.out.println("i using add ops :"+ops.i);  // inherited
	System.out.println("i using add ops :"+ops.j);  //defined
	
	ops.MathsMethod();  // inherited
	ops.OperationMethod();  // defined
	System.out.println();
	
	Maths math=new Addition();  // creation of object of maths() class using Addition() Class
//  Maths math=add;                // auto upcasting
//  Maths math=new Additon();      // auto upcasting
//  Maths math=(Maths) add;	   // explicit upcasting
	System.out.println("i using math obj :"+math.i);  // defined
	
	math.MathsMethod();  // defined
	 System.out.println();
	 
	 Operation ops1=(Operation)new Maths();
	 
	 ops1.OperationMethod();   // this is explicit down casting
	                           // we will get the below runtime error
	 						   // it will compile successfully but will throw error while running the program
	 //Exception in thread "main" java.lang.ClassCastException: DerivedCastingPrograms.Maths cannot be cast to DerivedCastingPrograms.Operation
	                          //at DerivedCastingPrograms.MathsTester.main(MathsTester.java:38)
	 
	 
	
	}

}
