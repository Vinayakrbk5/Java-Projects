package com.xworkz.bikes;

import java.util.List;

public interface BikesDAO {

	public void saveRecords(BikesDTO dto);
	
	public BikesDTO fetchAll(int id);
	
	public void deleteById(int id);
	
	public void updateBrandNameById(String brandName,int id);
	
	public void updatePriceAndBikeCCById(Double price,Integer CC,Integer id);
	
	public List<BikesDTO> fetch(List<Integer> id);
	
	public void saveRecords(List<BikesDTO> list);
	
	

}
