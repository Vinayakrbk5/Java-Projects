package com.xworkz.service;

import java.util.Date;

import com.xworkz.dto.SanitizerDTO;

public interface SanitizerService {

	public SanitizerDTO validateFetchByBrandName(String name);

	public SanitizerDTO validateFetchByBrandNameAndQuantity(String brand, Integer quantity);

	public String validateFetchBrandNameByIdAndQuantity(Integer id, Integer quantity);

	public Integer validateFecthIdByQuantityAndBrandName(Integer quantity, String brand);

	public SanitizerDTO validateFetchByBrandNameAndMfgDate(String brand, Date mfgdate);

}
