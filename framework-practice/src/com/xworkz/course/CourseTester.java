package com.xworkz.course;

import java.util.List;

import com.xworkz.singleton.SFSingleton;

public class CourseTester {

	public static void main(String[] args) {
		try {
			CourseDTO cdto = new CourseDTO();
			CoursesDAO cdao = new CoursesDAOImpl();
			cdto = cdao.fetchByCourseName("Java");
//		System.out.println(cdto);

//		cdao.saveRecords("CSS", 6000);

//			List<CourseDTO> list = cdao.fetchAll();
//			for (CourseDTO dto : list) {
//				System.out.println(dto);
//			}
			
			List<String> names=cdao.fetchAllCourseName();
//			names.forEach(p->System.out.println(p+" "));
//			names.forEach(System.out::println);
			
//			List<Object[]> objArray=cdao.fetchAllCourseNameAndCount();
//			for(Object[] obj:objArray)
//			{
//				System.out.println(obj[0] +" and "+obj[1]);
//			}
			
//			cdao.updateCourseNameById("Hibernate", 1);
			
//			cdao.updateCourseNameAndIdByFees("Hibernate", 20000, 20);
			
//			cdao.deleteByCourseName("HTML");
			
			cdao.deleteByIdAndFees(20, 20000);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			SFSingleton.closeSF();
		}
	}
}
