package com.xworkz.list;

public class Student //implements Comparable<Student>
{

	private int stId;
	private String stName;
	private String city;
	public Student(int stId, String stName, String city) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.city = city;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [stId=" + stId + ", stName=" + stName + ", city=" + city + "]";
	}
//	@Override
//	public int compareTo(Student stud) {
//		
//		return this.getStName().compareTo(stud.getStName());
//	}
		
	
}
