package com.xworkz.dao;

import java.util.Date;

import com.xworkz.dto.SanitizerDTO;

public interface SanitizerDAO {

	public SanitizerDTO fetchByBrandName(String name);

	public SanitizerDTO fetchByBrandNameAndQuantity(String brand, Integer quantity);

	public String fetchBrandNameByIdAndQuantity(Integer id, Integer quantity);

	public Integer fecthIdByQuantityAndBrandName(Integer quantity, String brand);

	public SanitizerDTO fetchByBrandNameAndMfgDate(String brand, Date mfgdate);

}
