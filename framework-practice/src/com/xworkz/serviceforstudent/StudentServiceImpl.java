package com.xworkz.serviceforstudent;

import com.xworkz.student.StudentDAO;
import com.xworkz.student.StudentDAOImpl;
import com.xworkz.student.StudentDTO;

public class StudentServiceImpl implements StudentService {

	public StudentServiceImpl() {

		System.out.println("Creating:" + this.getClass().getSimpleName());
	}

	@Override
	public void validateAndCreate(StudentDTO sdto) {

//		String newname=name.trim();
		if (sdto != null) {
			boolean valid = false;
			String name = sdto.getName();
			String newname=name.trim();
			if (name != null && !newname.isEmpty()) {
				System.out.println("Name is valid");
				valid = true;
			} else {
				System.err.println("Name is invalid");
				valid = false;
			}
			String number = sdto.getMobile();
			String newnumber = number.trim();
			if (newnumber.length() > 9) {
				System.out.println("Mobile number is valid");
				if(newnumber.length() > 9 && valid)
				{
				System.out.println("can save entity");	
				valid = true;
				}
				
			} else {
				System.out.println("Mobile number is invalid");
				valid = false;
			}

			String city = sdto.getCity();
			String newcity = city.trim();
			if (city != null & !newcity.isEmpty()) {
				System.out.println("City is valid");
				if(city != null & !newcity.isEmpty() && valid)
				{
					System.out.println("can save entity");
					valid = true;
				}
				
			} else {
				System.out.println("City is invalid");
				valid = false;
			}

			if (valid == true) {
				StudentDAO sdao = new StudentDAOImpl();
				sdao.create(sdto);
			} else {
				System.out.println("due to invlid field or fields, cannot save an entity");
			}
		}

	}

}
