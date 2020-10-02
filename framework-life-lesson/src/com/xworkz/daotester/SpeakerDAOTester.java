package com.xworkz.daotester;

import com.xworkz.lesson.dao.SpaekerDAOImpl;
import com.xworkz.lesson.dao.SpeakerDAO;
import com.xworkz.lesson.dto.SpeakerDto;

public class SpeakerDAOTester {

	public static void main(String[] args) {
		SpeakerDAO speakerdao=new SpaekerDAOImpl();
		SpeakerDto speakerdto=new SpeakerDto();
		
//		speakerdto.setSid(1);
		speakerdto.setType("Communicator");
		speakerdto.setUsedin("Sound System");
		speakerdto.setUsedfor("Increasing sound wavelength");
		
//		speakerdao.deleteByType("Electronics");
//		speakerdao.findByType("Dolby");
		speakerdao.insert(speakerdto);
//		speakerdao.updateUsedForRangeByType("200Mhz", "Dolby");
		
		
//		System.out.println("Spaeker is a type of :"+speakerdto.getType());
//		System.out.println("Speaker is used in "+speakerdto.getUsedin());
//		System.out.println("Speaker is used for "+speakerdto.getUsedfor());
	}
	}

