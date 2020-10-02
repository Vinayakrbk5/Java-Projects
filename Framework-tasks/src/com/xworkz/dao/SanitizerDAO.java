package com.xworkz.dao;

import java.util.Date;
import java.util.List;

import com.xworkz.dto.SanitizerDTO;

public interface SanitizerDAO {

	public SanitizerDTO fetchByBrandName(String name);

	public SanitizerDTO fetchByBrandNameAndQuantity(String name, Integer quantity);

	public String fetchBrandNameByIdAndQuantity(Integer id, Integer qauntity);

	public Integer fetchIdByQuantityAndBrandName(Integer quantity, String name);

	public SanitizerDTO fetchByBrandNameAndMFGDate(String name, Date mfgDate);

	public Long fetchCount();

	public Long fetchCountByPrice(Double price);

	public Double fetchMaxByPrice();

	public Double fetchSumByPrice();

	public Double fetchSecondMaxByPrice();

	public Object fetchBrandAndPriceById(Integer id);

	public List<SanitizerDTO> fetchAll();

	public List<String> fetchAllBrandName();

	public List<String> fetchAllBrandNameByQuantity(Integer quantity);

	public List<Object[]> fetchAllBrandNameAndPrice();

	public List<Object[]> fetchAllBrandNameAndCountByQuantity(Integer quantity);

	public List<Object> fetchAllBrandNameCountByPrice(Double price);

}
