package InheritanceEx;

public class Child1 implements Parent1, Parent2{
public void nose() {
	System.out.println("Has long nose");
}
public static void main(String[] args) {
	Child1 c=new Child1();
	c.nose();
	
	Parent2 p1=new Child1();   // upcasting is done here
	p1.nose();					//  calling overridden method
	System.out.println(p1.a);
}   
}
