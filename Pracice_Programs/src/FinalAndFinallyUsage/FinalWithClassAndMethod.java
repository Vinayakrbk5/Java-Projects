// if we use final keyword with class we cannot inherit it to child class
// if we use final keyword with method we cannot override it

package FinalAndFinallyUsage;

public class FinalWithClassAndMethod  extends FinalKeywordwithVariable{
	/*final*/ public void display()     // using final keyword with method we cannot override it in child class
	{
		System.out.println("This is display method in parent class");
	}

}
