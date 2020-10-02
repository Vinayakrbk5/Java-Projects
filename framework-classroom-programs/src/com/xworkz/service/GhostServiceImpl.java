package com.xworkz.service;

import java.util.Date;


import com.xworkz.dao.GhostDAO;
import com.xworkz.dao.GhostDAOImpl;
import com.xworkz.dto.GhostDTO;

public class GhostServiceImpl  implements GhostService{

	@Override
	public void validateCreate(GhostDTO gdto) {
		if(gdto!=null)
		{
			String ageGroup=gdto.getAgeGroup();
			String newAgeGroup=ageGroup.trim();
			String ghostType=gdto.getGhostType();
			String newGhostType=ghostType.trim();
			char gender=gdto.getGender();
			Date date=gdto.getDate();
			String color=gdto.getColor();
			String newcolor=color.trim();
			boolean danger=gdto.isDanger();
//			boolean valid=false;
			if(newAgeGroup !=null && !newAgeGroup.isEmpty())
			{
				System.out.println("AgeGroup is valid");
				if(newGhostType!=null && !newGhostType.isEmpty())
				{
					System.out.println("Ghost type is valid");
					if(gender=='M' || gender=='F' || gender=='m' || gender=='f')
					{
						System.out.println("Gender is valid");
						if(!date.equals(null))
						{
							System.out.println("Date is valid");
							if(newcolor!=null && !newcolor.isEmpty())
							{
								System.out.println("Color is valid");
								if(danger==true || danger==false)
								{
									System.out.println("Danger is valid");
									GhostDAO gdao=new GhostDAOImpl();
									gdao.create(gdto);
								}
								else
								{
									System.out.println("Danger is in valid");
								}
								
								
							}
							else {
								System.out.println("Color is invalid");
							}
						}
						else
						{
							System.out.println("Date is invalid");
						}
						
					}
					else
					{
						System.out.println("Gender is invalid");
					}
				}
				else
				{
					System.out.println("Ghost type is invalid");
				}
			}
			else
			{
				System.out.println("AgeGroup is invalid");
			}
		}
		else
		{
			System.out.println("Object is null");
		}
	}

	@Override
	public void ValidateUpdateDangerBYId(int id, boolean danger) {
		GhostDTO gdto=new GhostDTO();
		int gid=gdto.getGhostId();
		if(gid>0)
		{
			System.out.println("Danger is valid");
			GhostDAO gdao=new GhostDAOImpl();
			gdao.updateDangerBYId(id, danger);
		}
	}

	@Override
	public void validateDeleteById(int id) {
		
		GhostDTO gdto=new GhostDTO();
		int gid=gdto.getGhostId();
		if(gid>0)
		{
		GhostDAO gdao=new GhostDAOImpl();
		gdao.deleteById(id);
		}
		
	}

	@Override
	public void validateUpdateGenderAndDateById(char g, Date d, int id) {
		
		if(g=='M'||g=='m'|| g=='F'||g=='f')
		{
			System.out.println("Gender is valid");
//			DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy/mm/dd");
//			try {
//				format.parse(d);
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//			}
			
			GhostDAO gdao=new GhostDAOImpl();
			gdao.updateGenderAndDateById(g, d, id);
		}
		
	}

	
}
