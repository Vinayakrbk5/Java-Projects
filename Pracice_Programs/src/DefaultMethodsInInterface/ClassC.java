package DefaultMethodsInInterface;

public class ClassC  extends  ClassA implements ClassB {
//public void display()
//{
//	System.out.println("This is display method in class C");
//}
public static void main(String[] args) {
	ClassC clsC=new ClassC();
	System.out.println(clsC.display());
	//ClassB.display();
	//ClassA.display();
}
}
