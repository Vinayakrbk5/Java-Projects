package com.xworkz.criteria;

import java.util.List;

public interface StudentDAO {
	public List<StudentDTO> fetchById();

	public Double rowCount();
	
//	public StudentDTO fetch
	public void checkNull();

}
