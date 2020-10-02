package com.xworkz.criteriaex1;

import com.xworkz.singleton.SFSingleton;

public class PesronTester {

	public static void main(String[] args) {
		try {
		PersonDAO dao=new PersonDAOImpl();
		dao.readRecords();
		}
		finally {
			SFSingleton.closeSF();
		}
	}
}
