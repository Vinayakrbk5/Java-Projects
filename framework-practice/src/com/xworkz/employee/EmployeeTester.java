package com.xworkz.employee;

import java.util.ArrayList;

public class EmployeeTester {
public static void main(String[] args) {
	
//	ArrayList<EmployeeDTO> arrlist=new ArrayList<>();
//	arrlist.add(new EmployeeDTO("Vinayak",987987876,"Maharastra"));
//	arrlist.add(new EmployeeDTO("Vishal",878758979,"Karnataka"));
//	arrlist.add(new EmployeeDTO( "Nikhil", 76576576, "Kerala"));
//	EmployeeDTO edto=new EmployeeDTO();
//	edto.setName("Vinayak");
//	edto.setPhone(876876876);
//	edto.setState("Karnataka");
	
	EmployeeDAO edao=new EmployeeDAOImpl();
//	for(EmployeeDTO emp:arrlist)
//	{
//	edao.create(emp);
//	}
	
//	EmployeeDTO edto1=edao.readById(3);
//	System.out.println(edto1);
	
//	edao.updateNameById("Narendra", 2);
	
//	edao.deleteById(1);
	
	ArrayList<EmployeeDTO> arrlist=new ArrayList<>();
	arrlist=(ArrayList<EmployeeDTO>) edao.readAll();
	System.out.println(arrlist);
}

}
