package com.xworkz.lesson.dao;

import com.xworkz.lesson.dto.VirusDto;

public interface VirusDAO {


	public VirusDAO findByName(String name);
	public void deleteById(int id);
	public void updateNameById(String name, int id);
	public void insert(VirusDto virusdao);
	
}
