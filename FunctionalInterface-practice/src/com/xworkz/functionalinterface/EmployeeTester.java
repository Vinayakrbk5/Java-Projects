package com.xworkz.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTester {

public static void main(String[] args) {
	ArrayList<Employee> empArray=new ArrayList<>();
	empArray.add(new Employee(1, "Vinayak", 10000.00));
	empArray.add(new Employee(2, "Vishal", 20000.00));
	empArray.add(new Employee(3, "Hemanth", 25000.00));
	
	ArrayList<Employee> empArray2=new ArrayList<>();
	
	for(Employee emp:empArray)
	{
		if(emp.getSalary()>15000)
		{
			double sal=emp.getSalary()*2;
			empArray2.add(new Employee(emp.getEid(), emp.getName(), sal));
		}
	}
	
	List<Double> emparr=empArray.stream().filter(p->p.getSalary()>15000).map(p->p.getSalary()*2).collect(Collectors.toList());
	
	
	emparr.forEach(p->System.out.println(p));
//	for(Employee emp:empArray2)
//	{
//		System.out.println(emp);
//	}
	empArray2.forEach(p->System.out.println(p));
	empArray2.forEach(System.out::println);
}	
	
}

