package com.xworkz.laptop;

import java.util.List;

public interface LaptopDAO {

	public void save(List<LaptopDTO> dto); 
	
	public void fetchById(String id);
	public List<LaptopDTO> fetchAll();
	public void fetchBrandName();
	
	public void updateBrandNameById(String name,Integer id);
	public void insert(LaptopDTO dto);

}
