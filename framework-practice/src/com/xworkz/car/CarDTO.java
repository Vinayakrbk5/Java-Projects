package com.xworkz.car;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="car_table")
@NamedQueries(@NamedQuery(name="fetchBYBrnadName",query="select car from CarDTO car where brandName=:brand"))
@NamedNativeQueries(@NamedNativeQuery(name="fetchByPrice",query="select * from car_table where CAR_PRICE=:price"))
public class CarDTO {
	
	@Id
	@Column(name="CAR_ID")
	@GenericGenerator(name="xworkz",strategy="com.xworkz.customgenerator.CustomGeneratorForClassCar")
	@GeneratedValue(generator="xworkz")//com.xworkz.customgenerator.CustomGeneratorForClassCar
	private String cid;
	@Column(name="BRAND_NAME")
	private String brandName;
	@Column(name="CAR_PRICE")
	private Double price;

	public CarDTO() {
		System.out.println("Created class :"+this.getClass().getSimpleName());
	}
	
	public CarDTO(String brandName, Double price) {
		super();
		this.brandName = brandName;
		this.price = price;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CarDTO [cid=" + cid + ", brandName=" + brandName + ", price=" + price + "]";
	}

	
}
