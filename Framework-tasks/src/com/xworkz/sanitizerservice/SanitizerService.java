package com.xworkz.sanitizerservice;

import java.util.Date;
import java.util.List;

import com.xworkz.dto.SanitizerDTO;

public interface SanitizerService {

	public SanitizerDTO validateFetchByBrandName(String name);

	public SanitizerDTO validateFetchByBrandNameAndQuantity(String name, Integer quantity);

	public String validateFetchBrandNameByIdAndQuantity(Integer id, Integer qauntity);

	public Integer validateFetchIdByQuantityAndBrandName(Integer quantity, String name);

	public SanitizerDTO validateFetchByBrandNameAndMFGDate(String name, Date mfgDate);

	public Long validateFetchCount();

	public Long validateFetchCountByPrice(Double price);

	public Double validateFetchMaxByPrice();

	public Double validateFetchSumByPrice();

	public Double validateFetchSecondMaxByPrice();

	public Object validateFetchBrandAndPriceById(Integer id);
	
	public List<SanitizerDTO> validateFetchAll();

	public List<String> validateFetchAllBrandName();

	public List<String> validateFetchAllBrandNameByQuantity(Integer quantity);

	public List<Object[]> validateFetchAllBrandNameAndPrice();

	public List<Object[]> validateFetchAllBrandNameAndCountByQuantity(Integer quantity);

	public List<Object> validateFetchAllBrandNameCountByPrice(Double price);


}
