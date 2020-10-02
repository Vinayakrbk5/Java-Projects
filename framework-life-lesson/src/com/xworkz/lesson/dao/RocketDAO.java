package com.xworkz.lesson.dao;

import com.xworkz.lesson.dto.RocketDto;

public interface RocketDAO {

	public RocketDAO findByType(String type);
	public void deleteByCost(String cost);
	public void updateCostByType(String cost,String type);
	public void insert(RocketDto rocketdto);
	
}
