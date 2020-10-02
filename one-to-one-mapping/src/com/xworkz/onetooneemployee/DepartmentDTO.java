package com.xworkz.onetooneemployee;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "department")
public class DepartmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "auto")
	@GenericGenerator(name = "auto", strategy = "increment")
	@Column(name = "DEPARTMENT_ID")
	private int depId;
	@Column(name = "DEPARTMENT_NAME")
	private String depName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DEPARTMENT_ID")
	private EmployeeDTO empDto;

	public DepartmentDTO() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	public void setEmpDto(EmployeeDTO empDto) {
		this.empDto = empDto;
	}
	
	public EmployeeDTO getEmpDto() {
		return empDto;
	}
	
	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return "DepartmentDTO [depId=" + depId + ", depName=" + depName + "]";
	}

}
