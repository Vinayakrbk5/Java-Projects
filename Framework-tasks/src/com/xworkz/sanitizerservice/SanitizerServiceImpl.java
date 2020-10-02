package com.xworkz.sanitizerservice;

//import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import com.xworkz.dao.SanitizerDAO;
import com.xworkz.dao.SanitizerDAOImpl;
import com.xworkz.dto.SanitizerDTO;

public class SanitizerServiceImpl implements SanitizerService {
	private SanitizerDAO sdao = new SanitizerDAOImpl();

	@Override
	public SanitizerDTO validateFetchByBrandName(String name) {
		System.out.println("Validating :validateFetchByBrandName: Start");
		String newname = name.trim();
		if (newname != null && !newname.isEmpty()) {
			System.out.println("Name is valid");
			SanitizerDTO sanDto = sdao.fetchByBrandName(name);
			return sanDto;
		} else {
			System.out.println("Name is invalid");
		}
		System.out.println("Validating :validateFetchByBrandName: End");
		return null;
	}

	@Override
	public SanitizerDTO validateFetchByBrandNameAndQuantity(String name, Integer quantity) {

		String newName = name.trim();
		if (newName != null && !newName.isEmpty()) {
			System.out.println("Name is valid");
			if (quantity > 0) {
				System.out.println("Quantity is valid");
				SanitizerDTO sdto = sdao.fetchByBrandNameAndQuantity(name, quantity);
				return sdto;
			} else {
				System.out.println("Quantity is invalid");
			}
		} else {
			System.out.println("NAme is invalid");
		}

		return null;
	}

	@Override
	public String validateFetchBrandNameByIdAndQuantity(Integer id, Integer quantity) {
		if (id > 0 && quantity > 0) {
			System.out.println("Both id and quantity are valid");
			String name = sdao.fetchBrandNameByIdAndQuantity(id, quantity);
			return name;
		}

		return null;
	}

	@Override
	public Integer validateFetchIdByQuantityAndBrandName(Integer quantity, String name) {
		String newName = name.trim();
		if (newName != null && !newName.isEmpty()) {
			System.out.println("BrandName is valid");
			if (quantity > 0) {
				System.out.println("Quantity is valid");
				Integer sdto = sdao.fetchIdByQuantityAndBrandName(quantity, name);
				return sdto;

			} else {
				System.out.println("Quantity is invalid");
			}
		} else {
			System.out.println("Brand Name is invalid");
		}

		return null;
	}

	@Override
	public SanitizerDTO validateFetchByBrandNameAndMFGDate(String name, Date mfgDate) {
		String newName = name.trim();
		if (newName != null && !newName.isEmpty()) {
			SanitizerDTO sdto = sdao.fetchByBrandNameAndMFGDate(name, mfgDate);
			return sdto;
		}

		return null;
	}

	@Override
	public Long validateFetchCount() {
		try {
			Long count = sdao.fetchCount();
			return count;
		} catch (Exception e) {
			System.err.println("Something went wrong in validateFetchCount() method");
		}

		return null;
	}

	@Override
	public Long validateFetchCountByPrice(Double price) {

		if (price != null && price >= 0) {
			System.out.println("Price is valid");
			Long count = sdao.fetchCountByPrice(price);
			return count;
		} else {
			System.out.println("price is invalid");
		}
		return null;
	}

	@Override
	public Double validateFetchMaxByPrice() {
		Double maxPrice = sdao.fetchMaxByPrice();
		return maxPrice;
	}

	@Override
	public Double validateFetchSumByPrice() {
		Double totalPrice = sdao.fetchSumByPrice();

		return totalPrice;
	}

	@Override
	public Double validateFetchSecondMaxByPrice() {
		Double secMax = sdao.fetchSecondMaxByPrice();
		return secMax;
	}

	@Override
	public Object validateFetchBrandAndPriceById(Integer id) {
		if (id > 0) {
//			@SuppressWarnings("unchecked")
//			ArrayList<Object> arrList = (ArrayList<Object>) sdao.fetchBrandAndPriceById(id);
			Object[] obj=(Object[]) sdao.fetchBrandAndPriceById(id);
			return obj;
		}
		return null;
	}

	@Override
	public List<SanitizerDTO> validateFetchAll() {
		
		List<SanitizerDTO> list=sdao.fetchAll();
		if(Objects.nonNull(list))
		{
			System.out.println("Object is not null we can read values");
			return list;
		}
		else
		{
			System.out.println("object is null so we cannot read");
		}
		return null;
	}

	@Override
	public List<String> validateFetchAllBrandName() {
		List<String> list=sdao.fetchAllBrandName();
		if(Objects.nonNull(list))
		{
			System.out.println("list is not null. so we can read");
			return list;
		}
		else
		{
			System.out.println("List is null, so we cannot read");
		}
		return null;
	}

	@Override
	public List<String> validateFetchAllBrandNameByQuantity(Integer quantity) {
		List<String> list=sdao.fetchAllBrandNameByQuantity(quantity);
		if(Objects.nonNull(list))
		{
			System.out.println("list is not null,so we can read");
			return list;
		}
		else
		{
			System.out.println("Object is null,so we cannot read");
		}
		return null;
	}

	@Override
	public List<Object[]> validateFetchAllBrandNameAndPrice() {
		List<Object[]> list=sdao.fetchAllBrandNameAndPrice();
		if(Objects.nonNull(list))
		{
			System.out.println("List is not null, so we can read values");
			return list;
		}
		else
		{
			System.out.println("list is empty,so we cannot fetch values");
		}
		return null;
	}

	@Override
	public List<Object[]> validateFetchAllBrandNameAndCountByQuantity(Integer quantity) {
		List<Object[]> list=sdao.fetchAllBrandNameAndCountByQuantity(quantity);
		if(Objects.nonNull(list))
		{
			System.out.println("List is not empty, so we can fetc values");
			return list;
		}
		else
		{
			System.out.println("List is empty, so we cannot fetch values");
		}
		return null;
	}

	@Override
	public List<Object> validateFetchAllBrandNameCountByPrice(Double price) {
		List<Object> list=sdao.fetchAllBrandNameCountByPrice(price);
		if(Objects.nonNull(list))
		{
			System.out.println("List is not empty, so we can fetc values");
			return list;
		}
		else
		{
			System.out.println("List is empty, so we cannot fetch values");
		}
		return null;
	}

}
