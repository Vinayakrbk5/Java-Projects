package com.xworkz.nation;

import java.util.ArrayList;

import com.xworkz.singleton.SFSingleton;

public class NationTester {

	public static void main(String[] args) {
		try {
		ArrayList<NationDTO> arrlist=new ArrayList<>();
		arrlist.add(new NationDTO("India", "Delhi", 30));
		arrlist.add(new NationDTO("USA", "Newyork", 7));
		
		
		NationDAO ndao=new NationDAOImpl();
		ndao.create(arrlist);
//		ndao.updateNameById("Russia", 2);
//		NationDTO ndto=ndao.readById(3);
//		System.out.println(ndto);
//		ndao.deleteById(2);
//		ndao.deleteByName("India");
		}
		catch(Exception e)
		{
			System.err.println("Some thing went wrong");
			e.printStackTrace();
		}
		finally {
			SFSingleton.closeSF();
		}
		
	}

}
