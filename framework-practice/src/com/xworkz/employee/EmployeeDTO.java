package com.xworkz.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employee_table1")
public class EmployeeDTO implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="E_ID")
	@GenericGenerator(name="vinay",strategy="increment")
	@GeneratedValue(generator="vinay")
	private int eid;
	
	@Column(name="E_NAME")
	private String name;
	
	@Column(name="MOBILE_NUMBER")
	private int phone;
	
	@Column(name="STATE")
	private String state;
	
	public EmployeeDTO() {}

	public EmployeeDTO( String name, int phone, String state) {
		super();
//		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.state = state;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [eid=" + eid + ", name=" + name + ", phone=" + phone + ", state=" + state + "]";
	}
	
	
}
