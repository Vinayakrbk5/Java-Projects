package com.xworkz.cableservice;

import com.xworkz.lesson.dto.CableDto;

public interface CableServiceForCheck {

	public CableDto validateFindById(String id);

	public void validateDeleteByid(String id);

	public void validateUpdatecontentById(String content, String id);

	public void validateInsert(CableDto cabledto);
}
