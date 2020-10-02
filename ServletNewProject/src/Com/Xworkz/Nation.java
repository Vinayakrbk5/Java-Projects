package Com.Xworkz;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Nation extends GenericServlet {
	public Nation()
	{
		System.out.println(" This is Nation Class Constructor");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("This is Service Method");
		System.out.println("Hello World");
		String str=new String("Vinayak");
		System.out.println("My name is "+str);
		System.out.print("[");
		for(int i=0;i<10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("]");
	}

	}

