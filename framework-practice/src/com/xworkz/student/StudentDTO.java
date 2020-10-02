package com.xworkz.student;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="student_table")
public class StudentDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="S_ID")
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private int sid;
	
	@Column(name="S_NAME")
	private String name;
	
	@Column(name="MOBILE_NUMBER")
	private String mobile;
	
	@Column(name="CITY")
	private String city;
	
	public StudentDTO() {}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "StudentDTO [sid=" + sid + ", name=" + name + ", mobile=" + mobile + ", city=" + city + "]";
	}
}
