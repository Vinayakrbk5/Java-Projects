package MultipleInheritance;

public class Child1Class extends Parent1Class implements Parent2Class{

//	@Override
//	public void display() {
//		System.out.println("This is display method in child class");
//	}
	
	public static void main(String[] args) {
		Child1Class c1=new Child1Class();
		c1.display();
	}

}
