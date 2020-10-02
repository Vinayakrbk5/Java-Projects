package com.xworkz.streams;

public class Student {
	
	private Integer stId;
	private String name;
	private Integer age;
	private Department department;
	

	public Student() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}


	public Student(Integer stId, String name, Integer age, Department department) {
		super();
		this.stId = stId;
		this.name = name;
		this.age = age;
		this.department = department;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Integer getStId() {
		return stId;
	}


	public void setStId(Integer stId) {
		this.stId = stId;
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
		return "Student [stId=" + stId + ", name=" + name + ", age=" + age + ", department=" + department + "]";
	}

}
