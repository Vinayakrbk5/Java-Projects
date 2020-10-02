package com.xworkz.onetoone;

public class StudentTester {

	public static void main(String[] args) {
		System.out.println("Start : main method");
		try {
			StudentDTO sdto=new StudentDTO();
			sdto.setName("Vinayak");
			
			StudentDetailsDTO sdetails=new StudentDetailsDTO();
			
			sdetails.setPhoneNumber("88803293437");
			sdto.setSdetails(sdetails);
			sdetails.setStud(sdto);
			
			StudentDAO sdao=new StudentDAOImpl();
			
			sdao.save(sdto);
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			StudentUtil.closeSF();
			System.out.println("End : main method");
		}
		
	}

}
