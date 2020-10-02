package com.xworkz.nation;

import java.util.List;

public interface NationDAO {
	
	public void create(List<NationDTO> list);
	
	public void updateNameById(String name,int id);
	
	public NationDTO readById(int id);
	
	public void deleteById(int id);
	

}
