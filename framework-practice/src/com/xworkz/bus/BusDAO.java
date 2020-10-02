package com.xworkz.bus;

import java.util.List;

public interface BusDAO {

	public void create(BusDTO bdto);

	public BusDTO fetchByname(String name);

	public void deleteByCapacityAndId(Integer capacity, Integer id);

	public void updateIdByName(Integer id, String name);
	
	public Long fetchCount();
	
	public Long fetchByBusName();
	
	public Integer fetchMaxByCapacity();
	
	public Long fetchSumByCapacity();
	
	public Integer fetchSecondMaxByCapacity();
	
	public Object fetchBusNameAndCapacityById(int bId);
	
	public List<Object[]> fetchBusNameAndCountByCapacity(int capacity);
}
