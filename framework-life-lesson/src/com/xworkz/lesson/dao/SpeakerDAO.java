package com.xworkz.lesson.dao;

import com.xworkz.lesson.dto.SpeakerDto;

public interface SpeakerDAO {

	public SpeakerDAO findByType(String type);
	public void deleteByType(String type);
	public void updateUsedForRangeByType(String usedfor,String type);
	public void insert(SpeakerDto speakerdto);
	
}
