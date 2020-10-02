package Com.Xwork.servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SomeController extends GenericServlet {
	public SomeController()
	{
		System.out.println("This is inside SomeController Consctructor");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {

		System.out.println("This is in Service Method");
	}

}
