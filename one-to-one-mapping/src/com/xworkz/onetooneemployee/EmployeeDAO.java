package com.xworkz.onetooneemployee;

import java.util.Set;

public interface EmployeeDAO {

public void save(EmployeeDTO edto,Set<DepartmentDTO> set);
	
}
