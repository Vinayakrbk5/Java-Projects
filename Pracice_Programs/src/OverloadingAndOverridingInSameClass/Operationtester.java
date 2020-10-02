package OverloadingAndOverridingInSameClass;

public class Operationtester {

	public static void main(String[] args) {
	Addition add=new Addition();
	add.x=20;
	add.y=40;
	add.add();
	add.add(89);
	add.add(100, 200);
			
	}

}
