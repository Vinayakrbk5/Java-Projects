package ObjectClass;

public class HashCodeTester {
	public static void main(String[] args) {
		HashCode hash =new HashCode();
		System.out.println(hash);
		//hash.a=45;
		System.out.println(hash.hashCode());  //  it will prints integer converted hexa decimal code
											  //  if it is inherited it will prints latest one using property of polymorphism
	}

}
