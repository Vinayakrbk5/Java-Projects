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
@Table(name="ghost_table")
public class GhostDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="GHOST_ID")
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int ghostId;
	@Column(name="AGE_GROUP")
	private String ageGroup;
	@Column(name="GHOST_TYPE")
	private String ghostType;
	@Column(name="GENDER")
	private char gender;
	@Column(name="DEATH_DATE")
	private Date date;
	@Column(name="COLOR")
	private String color;
	@Column(name="DANGER")
	private boolean danger;
	
	public GhostDTO() {}

	public GhostDTO( String ageGroup, String ghostType, char gender, Date date, String color,
			boolean danger) {
		super();
		this.ageGroup = ageGroup;
		this.ghostType = ghostType;
		this.gender = gender;
		this.date = date;
		this.color = color;
		this.danger = danger;
	}

	public int getGhostId() {
		return ghostId;
	}

	public void setGhostId(int ghostId) {
		this.ghostId = ghostId;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getGhostType() {
		return ghostType;
	}

	public void setGhostType(String ghostType) {
		this.ghostType = ghostType;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDanger() {
		return danger;
	}

	public void setDanger(boolean danger) {
		this.danger = danger;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "GhostDTO [ghostId=" + ghostId + ", ageGroup=" + ageGroup + ", ghostType=" + ghostType + ", gender="
				+ gender + ", date=" + date + ", color=" + color + ", danger=" + danger + "]";
	}

}
