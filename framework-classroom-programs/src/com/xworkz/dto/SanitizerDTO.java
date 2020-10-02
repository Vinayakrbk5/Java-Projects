package com.xworkz.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="sanitizer_table")
public class SanitizerDTO implements Serializable{

	@Id
	@Column(name="S_ID")
	@GenericGenerator(name="India",strategy="increment")
	@GeneratedValue(generator="india")
	private Integer sId;
	@Column(name="S_BRAND_NAME")
	private String brandName;
	@Column(name="QUANTITY")
	private Integer quantity;
	@Column(name="PRICE")
	private Double price;
	@Column(name="MFG_DATE")
	private Date mfgDate;
	 
	public SanitizerDTO() {}
	
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(Date mfgDate) {
		this.mfgDate = mfgDate;
	}
	@Override
	public String toString() {
		return "SanitizerDTO [sId=" + sId + ", brandName=" + brandName + ", quantity=" + quantity + ", price=" + price
				+ ", mfgDate=" + mfgDate + "]";
	}
	
}
