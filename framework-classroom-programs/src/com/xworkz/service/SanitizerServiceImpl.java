package com.xworkz.service;

import java.util.Date;

import com.xworkz.dao.SanitizerDAO;
import com.xworkz.dao.SanitizerDAOImpl;
import com.xworkz.dto.SanitizerDTO;

public class SanitizerServiceImpl implements SanitizerService{

	@Override
	public SanitizerDTO validateFetchByBrandName(String name) {
		String sanName=name.trim();
		if(sanName!=null && !sanName.isEmpty())
		{
			SanitizerDAO sdao=new SanitizerDAOImpl();
			sdao.fetchByBrandName(name);
		}
		else {
			System.out.println("Invalid Name");
		}
		return null;
	}

	@Override
	public SanitizerDTO validateFetchByBrandNameAndQuantity(String brand, Integer quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String validateFetchBrandNameByIdAndQuantity(Integer id, Integer quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer validateFecthIdByQuantityAndBrandName(Integer quantity, String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SanitizerDTO validateFetchByBrandNameAndMfgDate(String brand, Date mfgdate) {
		// TODO Auto-generated method stub
		return null;
	}


}
