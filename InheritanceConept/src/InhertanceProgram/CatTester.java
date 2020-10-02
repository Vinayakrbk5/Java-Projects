package InhertanceProgram;

public class CatTester {

	public static void main(String[] args) {
	Cat domesticCat=new Cat(); 
	
	//  assigning the value to the child class Cat  using object of child class 
	domesticCat.cateyecolor="Blue";
	domesticCat.fuffy=true;
	
	// assigning the value to the parent class Animal  using object of child class ***
	domesticCat.isTail=true;
	domesticCat.nooflegs=4;
	
	//accessing the parent class methods using object of child class 
	domesticCat.move();
	domesticCat.eat();
	
	// accessing the parent class methods using object of child class 
	domesticCat.drink();
	domesticCat.Sound();
	
	
	System.out.println("The Eye color of cat : "+domesticCat.cateyecolor);
	System.out.println("The no of legs :"+domesticCat.nooflegs);
	System.out.println("has tail :"+domesticCat.isTail);
	System.out.println("is fuffy :"+domesticCat.fuffy);
	
	}

}
