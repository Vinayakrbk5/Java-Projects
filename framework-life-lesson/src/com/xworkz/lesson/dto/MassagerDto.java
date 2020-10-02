package com.xworkz.lesson.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="massager_table")

public class MassagerDto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name="MASSAGER_TYPE")
	private String type;
	@Column(name="UESD_FOR")
	private String usedfor;
	@Column(name="PRICE_RANGE")
	private String pricerange;
	@Id
	@Column(name="M_ID")
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int mid;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public MassagerDto() {}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUsedfor() {
		return usedfor;
	}

	public void setUsedfor(String usedfor) {
		this.usedfor = usedfor;
	}

	public String getPricerange() {
		return pricerange;
	}

	public void setPricerange(String pricerange) {
		this.pricerange = pricerange;
	}

}
