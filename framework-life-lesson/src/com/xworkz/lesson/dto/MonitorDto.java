package com.xworkz.lesson.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="monitor_table")
public class MonitorDto  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name="MONOTOR_TYPE")
	private String type;
	@Column(name="USED_FOR")
	private String usedfor;
	@Column(name="TOUCH")
	private String touch;
	@Id
	@Column(name="MON_ID")
	@GenericGenerator(name="auto", strategy="increment")
	@GeneratedValue(generator="auto")
	private int monid;
	

	public int getMonid() {
		return monid;
	}


	public void setMonid(int monid) {
		this.monid = monid;
	}


	public MonitorDto() {}


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



	public String getTouch() {
		return touch;
	}


	public void setTouch(String touch) {
		this.touch = touch;
	}

}
