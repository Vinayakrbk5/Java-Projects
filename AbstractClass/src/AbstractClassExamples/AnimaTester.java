package AbstractClassExamples;

public class AnimaTester {
	public static void main(String[] args) {
		Cow co=new Cow();
		Elephant ele=new Elephant();
		Human hum=new Human();
		Snake sn=new Snake();
		
		co.breath();
		co.eat();
		co.move();
		System.out.println();
		
		ele.breath();
		ele.eat();
		ele.move();
		System.out.println();
		
		hum.breath();
		hum.eat();
		hum.move();
		System.out.println();
		
		sn.breath();
		sn.eat();
		sn.move();
	}
		
	}

