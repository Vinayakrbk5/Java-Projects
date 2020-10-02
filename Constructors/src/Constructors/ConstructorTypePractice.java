package Constructors;

public class ConstructorTypePractice {
	 String name;
	 String color;
	 int price;
	 
	 ConstructorTypePractice()
	 {
		System.out.println("The process is to create the flowers"); 
	 }
	 ConstructorTypePractice(String name)
	 {
		 System.out.println("The Flower name is : "+name);
	 }
	 ConstructorTypePractice(String name ,String color)
	 {
		 System.out.println("The Flower "+name+" has "+color+ " color");
	 }
	 ConstructorTypePractice(String name, String color,int price)
	 {
		 System.out.println("The flower "+name+" has "+color+" color and it's price is "+price+" rupees");
	 }

	public static void main(String[] args) {
		ConstructorTypePractice flower=new ConstructorTypePractice();
		ConstructorTypePractice flower1=new ConstructorTypePractice("Rose");
		//ConstructorTypePractice flower2=new ConstructorTypePractice("Lotus", "Red");
		ConstructorTypePractice flower3 =new ConstructorTypePractice("Sun Flower","Yellow",100);

	}

}
