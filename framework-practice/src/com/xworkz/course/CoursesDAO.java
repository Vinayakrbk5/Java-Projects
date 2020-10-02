package com.xworkz.course;

import java.util.List;

public interface CoursesDAO {

	public CourseDTO fetchByCourseName(String courseName);
	
	public void saveRecords(String cName,int fees);
	
	public List<CourseDTO> fetchAll();
	
	public List<String> fetchAllCourseName();
	
	public List<Object[]> fetchAllCourseNameAndCount();
	
	public void updateCourseNameById(String courseName,int id);
	
	public void updateCourseNameAndIdByFees(String name,int fees,int id);
	
	public void deleteByCourseName(String name);
	public void deleteByIdAndFees(int id,int fees);
	
	
	
	

}
