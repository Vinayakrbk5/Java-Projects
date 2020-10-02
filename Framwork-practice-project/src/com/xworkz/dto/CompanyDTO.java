package com.xworkz.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="company_table")
public class CompanyDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COMPANY_NAME")
	private String companyName;
	@Column(name="GROSS_PROFIT")
	private Integer grossProfit;
	@Column(name="COMPANY_CEO")
	private String companyCEO;
	@Id
	@Column(name="C_ID")
	private Integer cid;
	
	public CompanyDTO(String companyName, Integer grossProfit, String companyCEO, Integer cid) {
		super();
		this.companyName = companyName;
		this.grossProfit = grossProfit;
		this.companyCEO = companyCEO;
		this.cid = cid;
	}
	
	public CompanyDTO()
	{
		System.out.println("This is "+this.getClass().getSimpleName());
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getGrossProfit() {
		return grossProfit;
	}
	public void setGrossProfit(Integer grossProfit) {
		this.grossProfit = grossProfit;
	}
	public String getCompanyCEO() {
		return companyCEO;
	}
	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "CompanyDTO [companyName=" + companyName + ", grossProfit=" + grossProfit + ", companyCEO="
				+ companyCEO + ", cid=" + cid + "]";
	}
}
