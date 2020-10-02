package com.xworkz.criteria;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="stud_table")
public class StudentDTO implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="s_ID")
	private Integer sId;
	@Column(name="S_NAME")
	private String name;
	@Column(name="S_AGE")
	private Integer age;
	
	public StudentDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	
	public StudentDTO(Integer sId, String name, Integer age) {
		super();
		this.sId = sId;
		this.name = name;
		this.age = age;
	}
	public Integer getsId() {
		return sId;
	}
	public void setsId(Integer sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentDTO [sId=" + sId + ", name=" + name + ", age=" + age + "]";
	}
	

}
