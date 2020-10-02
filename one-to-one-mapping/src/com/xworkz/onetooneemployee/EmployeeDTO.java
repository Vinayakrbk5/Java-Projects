package com.xworkz.onetooneemployee;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employee")
public class EmployeeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator="auto")
	@GenericGenerator(name="auto",strategy="increment")
	@Column(name="EMPLOYEE_ID")
	private int empId;
	@Column(name="EMPLOYEE_NAME")
	private String empName;
	@PrimaryKeyJoinColumn
	@OneToMany(cascade=CascadeType.ALL)
	private DepartmentDTO depDto;
	
	public EmployeeDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	 public void setDepDto(DepartmentDTO depDto) {
		this.depDto = depDto;
	}
	 
	 public DepartmentDTO getDepDto() {
		return depDto;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + "]";
	}


}
