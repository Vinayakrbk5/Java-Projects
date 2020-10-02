package com.xworkz.criteriaex1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class PersonDTO {

	@Id
	@Column(name="PERSON_ID")
	private Integer pesronId;
	@Column(name="PERSON_NAME")
	private String personName;
	@Column(name="PERSON_AGE")
	private Integer age;
	
	public PersonDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}

	public Integer getPesronId() {
		return pesronId;
	}

	public void setPesronId(Integer pesronId) {
		this.pesronId = pesronId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "PersonDTO [pesronId=" + pesronId + ", personName=" + personName + ", age=" + age + "]";
	}
	
	

}
