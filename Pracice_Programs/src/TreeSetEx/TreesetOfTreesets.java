package TreeSetEx;

import java.util.TreeSet;

public class TreesetOfTreesets {
	public static void main(String[] args) {
		TreeSet<TreeSet<Integer>> Tset=new TreeSet<>();
		TreeSet<Integer> Iset=new TreeSet<>();
		TreeSet<Integer> Sset=new TreeSet<>();
		TreeSet<Integer> Cset=new TreeSet<>();
		
		Iset.add(20);
		Iset.add(10);
		Iset.add(25);
		System.out.println("Integer set one :"+Iset);
		
		Sset.add(12);
		Sset.add(8);
		Sset.add(14);
		System.out.println("Integer set two :"+Sset);
		
		Cset.add(19);
		Cset.add(6);
		Cset.add(9);
		Cset.add(4);
		Cset.add(10);
		Cset.add(15);
		System.out.println("Integer set three :"+Cset);
		
		Tset.add(Sset);
		Tset.add(Iset);
		Tset.add(Cset);
		System.out.println("Set of sets :"+Tset);
		
	}

}
