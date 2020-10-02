package com.xworkz.dao;

import java.util.Date;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.dto.SanitizerDTO;
import com.xworkz.singltonsf.SFSingleton;

public class SanitizerDAOImpl implements SanitizerDAO {
	SessionFactory factory=SFSingleton.returnSF();
	
	
	@Override
	public SanitizerDTO fetchByBrandName(String name) {
		
		Session session=factory.openSession();
		try {
			String sqlselect="select SD from SanitizerDTO where brandName='"+name+"'";
			Query query=session.createQuery(sqlselect);
			SanitizerDTO sdto=(SanitizerDTO)query.uniqueResult();
			return sdto;
			
		}catch (Exception e) {
			System.err.println("Something went wrong in session");
		}
		finally {
			session.close();
		}
		return null;
	}

	@Override
	public SanitizerDTO fetchByBrandNameAndQuantity(String brand, Integer quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String fetchBrandNameByIdAndQuantity(Integer id, Integer quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer fecthIdByQuantityAndBrandName(Integer quantity, String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SanitizerDTO fetchByBrandNameAndMfgDate(String brand, Date mfgdate) {
		// TODO Auto-generated method stub
		return null;
	}

}
