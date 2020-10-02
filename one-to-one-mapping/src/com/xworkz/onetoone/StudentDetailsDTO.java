package com.xworkz.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="STUDENT_DETAILS")
public class StudentDetailsDTO implements Serializable{
	@Id
	@Column(name="student_id")
	@GeneratedValue(generator="auto")
//	@GenericGenerator(name="auto",strategy="foreign",parameters= {@Parameter(value="student11",name="property")})
	@GenericGenerator(name="auto",strategy="increment")
	private int stId;
	@Column(name="STUD_PHONE")
	private String phoneNumber;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="student_id")
	private StudentDTO stud;
	
	
	public StudentDetailsDTO() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	public void setStud(StudentDTO stud) {
		this.stud = stud;
	}
	public StudentDTO getStud() {
		return stud;
	}


	public int getStId() {
		return stId;
	}


	public void setStId(int stId) {
		this.stId = stId;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "StudentDetailsDTO [stId=" + stId + ", phoneNumber=" + phoneNumber + ", stud=" + stud + "]";
	}



}
