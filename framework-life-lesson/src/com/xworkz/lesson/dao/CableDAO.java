package com.xworkz.lesson.dao;

import com.xworkz.lesson.dto.CableDto;

public interface CableDAO {

	public CableDto findById(String id);

	public void deleteByid(String id);

	public void updatecontentById(String content, String id);

	public void insert(CableDto cabledto);

}
