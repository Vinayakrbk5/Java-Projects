package com.xworkz.onetooneemployee;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.xworkz.onetoone.StudentUtil;

public class EmpTester {

	public static void main(String[] args) {
		System.out.println("Start : main method");
		try {
			Set<DepartmentDTO> set=new LinkedHashSet<DepartmentDTO>();
			
			ArrayList<Integer> arrList=new ArrayList<>();
//			arrList.
			EmployeeDTO edto=new EmployeeDTO();
			
			DepartmentDTO dDto=new DepartmentDTO();
			dDto.setDepName("ECE");
			dDto.setEmpDto(edto);
			
			DepartmentDTO dDto1=new DepartmentDTO();
			dDto1.setDepName("CSE");
			dDto.setEmpDto(edto);
			
			edto.setEmpName("Vinayak");
			
			set.add(dDto);
			set.add(dDto1);
			
			EmployeeDAO eDao=new EmployeeDAOImpl();
			eDao.save(edto,set);
			
			
			EmployeeDAO edao = new EmployeeDAOImpl();
			edao.save(edto,set);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			StudentUtil.closeSF();
		}
		System.out.println("End : main method");
	}
}
