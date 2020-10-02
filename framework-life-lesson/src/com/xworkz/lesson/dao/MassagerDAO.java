package com.xworkz.lesson.dao;

import com.xworkz.lesson.dto.MassagerDto;

public interface MassagerDAO {

	public MassagerDAO findByType(String type);
	public void deleteByType(String type);
	public void updatePriceRangeByType(String pricerange,String type);
	public void insert(MassagerDto massagerdto);
	

}
