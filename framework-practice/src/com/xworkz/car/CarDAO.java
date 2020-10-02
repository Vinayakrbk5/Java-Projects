package com.xworkz.car;

import java.util.List;

public interface CarDAO {

	public void save(List<CarDTO> list);
	
	public CarDTO fetchBYBrnadName(String brandName);// using namedquery
	
	public CarDTO fetchByPrice(Double price);
}
