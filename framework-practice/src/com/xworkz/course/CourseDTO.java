package com.xworkz.course;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="course_table")
//@NamedQueries(@NamedQuery(name="updateCourseNameById",query="update cor CourseDTO"))
@NamedNativeQueries({@NamedNativeQuery(name="deleteByCourseName",query=" delete from course_table where COURSE_NAME=:name"),
	@NamedNativeQuery(name="deleteByIdAndFees",query="delete from course_table where COURSE_ID=:id and COURSE_FEES=:fees")})
@NamedQueries({@NamedQuery(name="updateCourseNameAndIdByFees" ,query="update CourseDTO cor set  cor.courseName=:cName, cor.cid=:id where cor.fees=:fee")})
public class CourseDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="COURSE_ID")
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	private Integer cid;
	@Column(name="COURSE_NAME")
	private String courseName;
	@Column(name="COURSE_FEES")
	private Integer fees;
	
	public CourseDTO() {
		super();
	}
	public CourseDTO(Integer cid, String courseName, Integer fees) {
		super();
		this.cid = cid;
		this.courseName = courseName;
		this.fees = fees;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "CoursesTester [cid=" + cid + ", courseName=" + courseName + ", fees=" + fees + "]";
	}
	

}
