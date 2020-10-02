package HashSetEx;

import java.util.HashSet;

public class BusTester {

	public static void main(String[] args) {
		HashSet<Bus> bset=new HashSet<>();
		bset.add(new Bus("KSRTC",false,6));
		bset.add(new Bus("Rajahamsa",true,8));
		bset.add(new Bus("BMTC",false,6));
		System.out.println(bset);
		
		System.out.println("_ _ _Opeartions_ _ _");
//		clear() -> clear the entire set
		
	}
}
