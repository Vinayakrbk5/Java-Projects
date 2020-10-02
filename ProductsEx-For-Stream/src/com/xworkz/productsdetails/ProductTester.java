package com.xworkz.productsdetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductTester {

	public static void main(String[] args) {
		ArrayList<Product> arrList=new ArrayList<>();
		arrList.add(new Product(1, "Samsung", 10000));
		arrList.add(new Product(2, "Nokia", 5000));
		arrList.add(new Product(3, "Oppo", 20000));
		arrList.add(new Product(4, "MI", 8000));
		arrList.add(new Product(5, "Apple", 100000));
		ArrayList<Product> arrList2=new ArrayList<>();
		ArrayList<Double> arrList3=new ArrayList<>();
		for(Product prod:arrList)
		{
			if(prod.getPrice()>=20000)
			{
				System.out.println(prod);
				double pri=prod.getPrice()*2;
				arrList2.add(new Product(prod.getId(), prod.getName(), pri));
				arrList3.add(pri);
			}
		}
		System.out.println(arrList2);
		System.out.println(arrList3);
		
		List<String> names=arrList.stream().map(p->p.getName()).collect(Collectors.toList());
		System.out.println(names);
		
		List<Double> list=arrList.stream().filter(p->p.getPrice()>=20000).map(p->p.getPrice()*2).collect(Collectors.toList());
		System.out.println("From Stream :"+list);
	}

	
	
}
