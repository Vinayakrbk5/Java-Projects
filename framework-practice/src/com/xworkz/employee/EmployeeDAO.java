package com.xworkz.employee;

import java.util.List;

public interface EmployeeDAO {

	public void create(EmployeeDTO edto);
	public EmployeeDTO readById(int eid);
	public void updateNameById(String name,int eid);
	public void deleteById(int eid);
	
	public List<EmployeeDTO> readAll();
	
}
