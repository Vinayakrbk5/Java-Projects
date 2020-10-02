package com.xworkz.bikes;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="bike_table")
public class BikesDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="B_ID")
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private Integer bId;
	@Column(name="BRAND_NAME")
	private String brandName;
	@Column(name="B_PRICE")
	private Double price;
	@Column(name="BIKE_CC")
	private Integer bikeCC;

	public BikesDTO() {
		super();
		System.out.println("Creating Class"+this.getClass().getSimpleName());
	}

	public BikesDTO(String brandName, Double price, Integer bikeCC) {
		super();
		this.brandName = brandName;
		this.price = price;
		this.bikeCC = bikeCC;
	}

	public Integer getbId() {
		return bId;
	}

	public void setbId(Integer bId) {
		this.bId = bId;
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

	public Integer getBikeCC() {
		return bikeCC;
	}

	public void setBikeCC(Integer bikeCC) {
		this.bikeCC = bikeCC;
	}

	@Override
	public String toString() {
		return "BikesDTO [bId=" + bId + ", brandName=" + brandName + ", price=" + price + ", bikeCC=" + bikeCC + "]";
	}

}
