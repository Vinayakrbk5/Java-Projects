package com.xworkz.dao;

import java.util.Date;

import com.xworkz.dto.GhostDTO;

public interface GhostDAO {

	public void create(GhostDTO gdto);
	public void updateDangerBYId(int id,boolean danger);
	public void deleteById(int id);
	public void updateGenderAndDateById(char g,Date d,int id);

}
