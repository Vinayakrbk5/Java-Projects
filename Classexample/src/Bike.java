
public class Bike {
	//features of products =variables
String color;
int cc;
int weight;

Bike(){
	System.out.println("Creating the bikes");
}
//functions/behaviour = method
void move()
{
	System.out.println("The bike is moving");
}
void speed() {
	System.out.println("The bike is speeding");
}

void horn() {
	System.out.println("The bike is horning");
}
public static void main(String[] args) {
	Bike pulsar=new Bike();
	pulsar.cc=220;
	pulsar.color="Black";
	pulsar.weight=150;
	
	System.out.println("pulsar color is : "+pulsar.color);
	System.out.println("pulsar cc is : "+pulsar.cc);
	System.out.println("pulsar weight is : "+pulsar.weight);
	System.out.println("---------------------------");
Bike ktm=new Bike();
ktm.cc=250;
ktm.color="Orange";
ktm.weight=200;
System.out.println("ktm color is : "+ktm.color);
System.out.println("ktm cc is : "+ktm.cc);
System.out.println("ktm weight is : "+ktm.weight);
}
}