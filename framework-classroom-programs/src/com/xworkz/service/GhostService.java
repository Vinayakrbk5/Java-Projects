package com.xworkz.service;

import java.util.Date;

import com.xworkz.dto.GhostDTO;

public interface GhostService {

	public void validateCreate(GhostDTO gdto);
	public void ValidateUpdateDangerBYId(int id,boolean danger);
	public void validateDeleteById(int id);
	public void validateUpdateGenderAndDateById(char g,Date d,int id);


}
