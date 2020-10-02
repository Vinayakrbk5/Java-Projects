package PolymorphismExample;

public class Bus  extends Vehicle{
 boolean isAC;
 
 @Override  //   this is keyword to indicate overriding
 public void displaycapacity()
 {
	 System.out.println("The fuel capacity of Bus is  200 ltrs");
 }
}
