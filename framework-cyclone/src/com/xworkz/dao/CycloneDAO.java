package com.xworkz.dao;

import java.util.List;

import com.xworkz.dto.CycloneDTO;

public interface CycloneDAO {

	public void create(CycloneDTO dto);
	public void saveList(List<CycloneDTO> list);
	public CycloneDTO fetchById(int id);
	public void updateAreaAffetctedById(double area,int pk);
	public default void updateAreaAffetctedAndDisasterManagementById(double area,boolean dm,int pk)
	{
		
	}
	public void deleteById(int id);
	public default void updateNameById(String name,int pk)
	{
		
	}
	

}
