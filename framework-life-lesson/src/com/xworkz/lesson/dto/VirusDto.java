package com.xworkz.lesson.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "virus_table")

public class VirusDto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "VIRUS_NAME")
	private String name;
	@Column(name = "ORIGIN")
	private String origin;
	@Column(name = "KILLED_NOW")
	private int killedtillnow;
	@Column(name = "SIZE")
	private String size;
	@Column(name = "SPREAD_TYPE")
	private String spreadtype;
	@Id
	@Column(name = "V_ID")
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	private int vid;
	
	@Column(name="START_DATE")
	private Date startDate;
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public VirusDto() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public int getKilledtillnow() {
		return killedtillnow;
	}

	public void setKilledtillnow(int killedtillnow) {
		this.killedtillnow = killedtillnow;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSpreadtype() {
		return spreadtype;
	}

	public void setSpreadtype(String spreadtype) {
		this.spreadtype = spreadtype;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "VirusDto [name=" + name + ", origin=" + origin + ", killedtillnow=" + killedtillnow + ", size=" + size
				+ ", spreadtype=" + spreadtype + ", vid=" + vid +" Date="+startDate+"]";
	}

}
