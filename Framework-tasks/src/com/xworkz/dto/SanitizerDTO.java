package com.xworkz.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "sanitizer_table")
//@NamedNativeQueries({@NamedQuery)
@NamedQueries({@NamedQuery(name="fetchByBrandName",query="select SD from SanitizerDTO SD where brandName=:brand"),
	@NamedQuery(name="fetchByBrandNameAndQuantity",query="select SD from SanitizerDTO  SD where brandName=:brand and quantity=:qty"),
	@NamedQuery(name="fetchBrandNameByIdAndQuantity",query="select SD.brandName from SanitizerDTO SD where SD.sId=:sid and SD.quantity=:qty"),
	@NamedQuery(name="fetchIdByQuantityAndBrandName",query="select SD.sId from SanitizerDTO SD where SD.quantity=:qty and  SD.brandName=:brand"),
	@NamedQuery(name="fetchByBrandNameAndMFGDate",query="select SD from SanitizerDTO SD where brandName=:brand and mFGDate=:date"),
	@NamedQuery(name="fetchCountByPrice",query="select count(SD) from SanitizerDTO SD where price=:price"),
	@NamedQuery(name="fetchBrandAndPriceById",query="select SD.brandName,SD.price from SanitizerDTO SD where sId=:id"),
	@NamedQuery(name="fetchAll",query="select san from SanitizerDTO san"),
	@NamedQuery(name="fetchAllBrandName",query="select san.brandName from SanitizerDTO san"),
	@NamedQuery(name="fetchAllBrandNameByQuantity",query="select san.brandName from SanitizerDTO san where quantity=:qty"),
	@NamedQuery(name="fetchAllBrandNameAndPrice",query="select san.brandName,san.price from SanitizerDTO san"),
	@NamedQuery(name="fetchAllBrandNameAndCountByQuantity",query="select san.brandName,count(san.brandName) from SanitizerDTO san where quantity=:qty"),
	@NamedQuery(name="fetchAllBrandNameCountByPrice",query="select san.brandName,count(san.brandName) from SanitizerDTO san where price=:price ")})
public class SanitizerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "S_ID")
	private Integer sId;
	@Column(name = "S_BRAND_NAME")
	private String brandName;
	@Column(name = "QUANTITY")
	private Integer quantity;
	@Column(name = "PRICE")
	private Double price;
	@Column(name = "MFG_DATE")
	private Date mFGDate;

	public SanitizerDTO() {
//		System.out.println("Create :" + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "SanitizerDTO [sId=" + sId + ", brandName=" + brandName + ", quantity=" + quantity + ", price=" + price
				+ ", mFGDate=" + mFGDate + "]";
	}

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

	public Date getmFGDate() {
		return mFGDate;
	}

	public void setmFGDate(Date mFGDate) {
		this.mFGDate = mFGDate;
	}

}
