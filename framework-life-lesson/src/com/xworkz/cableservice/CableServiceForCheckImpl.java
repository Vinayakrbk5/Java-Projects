package com.xworkz.cableservice;

import com.xworkz.lesson.dao.CableDAO;
import com.xworkz.lesson.dao.CableDAOImpl;
import com.xworkz.lesson.dto.CableDto;

public class CableServiceForCheckImpl implements CableServiceForCheck {

	@Override
	public CableDto validateFindById(String id) {
		CableDto cdto=new CableDto();
		String strid = id.trim();
		if (strid != null) {
			System.out.println("Id is valid");
			CableDAO cdao = new CableDAOImpl();
			cdto=cdao.findById(id);
		} else {
			System.out.println("Id is invalid");
		}
		return cdto;

	}

	@Override
	public void validateDeleteByid(String id) {
		String strid = id.trim();
		if (strid != null && !strid.isEmpty()) {
			System.out.println("Id is valid");
			CableDAO cdao = new CableDAOImpl();
			cdao.deleteByid(id);;
		} else {
			System.out.println("Id is invalid");
		}

	}

	@Override
	public void validateUpdatecontentById(String content, String id) {
		String newcontent = content.trim();
		String stringid = id.trim();
		if (stringid != null && !stringid.isEmpty()) {
			System.out.println("Id is valid");
			if (newcontent != null && !newcontent.isEmpty()) {
				System.out.println("Content is valid");
				CableDAO cdao = new CableDAOImpl();
				cdao.updatecontentById(content, id);
			} else {
				System.out.println("Content is invalid");
			}
		} else {
			System.out.println("Id is invalid");
		}
	}

	@Override
	public void validateInsert(CableDto cabledto) {
		if (cabledto != null) {
			System.out.println("Object is not null");
			CableDAO cdao = new CableDAOImpl();
			cdao.insert(cabledto);
		} else {
			System.out.println("Object is null,cannot save");
		}

	}

}
