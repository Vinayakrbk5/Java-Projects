package com.xworkz.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="cyclone_table")
public class CycloneDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="CYCLONE_SPEED")
	private int speed;
	
	@Column(name="CYCLONE_NAME")
	private String name;
	
	@Column(name="DESASTER_MANAGEMENT")
	private boolean desastermanagement;
	
	@Column(name="LOSS")
	private double areaAfftected;
	
	@Id
	@Column(name="C_ID")
	@GenericGenerator(name="auto" ,strategy="increment")
	@GeneratedValue(generator="auto")
	private int cid;
	
	public CycloneDTO()
	{}
	
	public CycloneDTO(int speed, String name, boolean desastermanagement, double areaAfftected) {
		super();
		this.speed = speed;
		this.name = name;
		this.desastermanagement = desastermanagement;
		this.areaAfftected = areaAfftected;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDesastermanagement() {
		return desastermanagement;
	}
	public void setDesastermanagement(boolean desastermanagement) {
		this.desastermanagement = desastermanagement;
	}
	public double getareaAfftected() {
		return areaAfftected;
	}
	public void setareaAfftected(double areaAfftected) {
		this.areaAfftected = areaAfftected;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "CycloneDTO [speed=" + speed + ", name=" + name + ", desastermanagement=" + desastermanagement
				+ ", areaAfftected=" + areaAfftected + ", cid=" + cid + "]";
	}
}
