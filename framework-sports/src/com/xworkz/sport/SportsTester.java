package com.xworkz.sport;

import com.xworkz.sport.dao.SportsDAO;
import com.xworkz.sport.dao.SportsDAOImpl;
import com.xworkz.sport.dto.SportsDTO;

public class SportsTester {

	public static void main(String[] args) {
		SportsDTO sdto=new SportsDTO();
//		sdto.setSid(6);
		sdto.setGameType("indoor");
		sdto.setDuration(90);
		sdto.setName("BasketBall");
		sdto.setNoOfPlayers(6);
		
		System.out.println(sdto);
		SportsDAO sdao=new SportsDAOImpl();
		sdao.create(sdto);
		}

}
