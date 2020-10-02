package com.xworkz.lesson.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;

@Entity
@Table(name = "rocket_table")
public class RocketDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ROCKET_TYPE")
	private String type;
	@Column(name = "PURPOSE")
	private String purpose;
	@Column(name = "COST")
	private Double cost;
	@Column(name = "R_ORGANIZATION")
	private String organization;
	@Column(name = "LAUNCH_STATION")
	private String launchstation;
	@Id
	@Column(name = "ROCK_ID")
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	private int rid;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public RocketDto() {
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getLaunchstation() {
		return launchstation;
	}

	public void setLaunchstation(String launchstation) {
		this.launchstation = launchstation;
	}

}
