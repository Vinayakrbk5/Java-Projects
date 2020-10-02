package CustomException;

import java.sql.SQLException;

public class CustomExceptionEx  extends SQLException{
	CustomExceptionEx()
	{
		super();
		System.out.println("This SQLException is made in java class");
	}
	CustomExceptionEx(String str)
	{
		this();
		System.out.println("this is "+str+" Exception");
	}

}
