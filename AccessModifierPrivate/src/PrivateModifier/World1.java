package PrivateModifier;

import PrivateModifier.World;

public class World1 {

	public static void main(String[] args) {
		World china = new World("China"); // this is not visible because World() class constructor is defined as private
		pop(150);                         // not visible because methood pop() is defined as a private
		china.size = 4;                   // not visible because instance variable size is private
	}

}
