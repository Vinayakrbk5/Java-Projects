package com.xworkz.preparedstatement;

public class Student {


private Integer stId;
private String name;
private Integer age;
public Student(Integer stId, String name, Integer age) {
	super();
	this.stId = stId;
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "Student [stId=" + stId + ", name=" + name + ", age=" + age + "]";
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
}