package Com.Xwork;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class ServletProgram1 extends GenericServlet {
	private String name;
    public ServletProgram1() {
        System.out.println(" This is ServletProgram1 Constructor");
        name="Vinayak";
    }
	

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("My name is : "+name);
		
	}
	
	}

