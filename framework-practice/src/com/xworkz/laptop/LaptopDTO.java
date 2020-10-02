package com.xworkz.laptop;

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
@Table(name="laptop_table")
@NamedNativeQueries({@NamedNativeQuery(name="fetchById",query="select * from laptop_table where LAPTOP_ID=:id"),
	@NamedNativeQuery(name="fetchBrandName",query="select BRAND_NAME from laptop_table")})
@NamedQueries({@NamedQuery(query="select lap from LaptopDTO lap", name = "fetchAll")})
public class LaptopDTO {
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="LAPTOP_ID")
	private int lId;
	@Column(name="BRAND_NAME")
	private String brand;
	@Column(name="PRICE")
	private Integer price;

	public LaptopDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	public LaptopDTO(String brand, Integer price) {
		this.brand = brand;
		this.price = price;
	}

	public Integer getlId() {
		return lId;
	}

	public void setlId(Integer lId) {
		this.lId = lId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "LaptopDTO [lId=" + lId + ", brand=" + brand + ", price=" + price + "]";
	}
	
	

}
