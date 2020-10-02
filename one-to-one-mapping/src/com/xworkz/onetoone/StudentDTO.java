package com.xworkz.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="STUDENT")
public class StudentDTO implements Serializable{
	@Id
	@GenericGenerator(name="xworkz",strategy="increment")
	@GeneratedValue(generator="xworkz")
	@Column(name="student_id")
	private int stId;
	@Column(name="STUD_NAME")
	private String name;
	 
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentDetailsDTO sdetails;
	
	public StudentDTO() {
		System.out.println("created "+this.getClass().getSimpleName());
	}

	public void setSdetails(StudentDetailsDTO sdetails) {
		this.sdetails = sdetails;
	}
	
	public StudentDetailsDTO getSdetails() {
		return sdetails;
	}


	public int getStId() {
		return stId;
	}


	public void setStId(int stId) {
		this.stId = stId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentDTO [stId=" + stId + ", name=" + name + ", sdetails=" + sdetails + "]";
	}


	

}
