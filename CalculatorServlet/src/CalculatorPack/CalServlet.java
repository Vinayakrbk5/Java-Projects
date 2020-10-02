package CalculatorPack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalServlet")
public class CalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CalServlet() {
        super();
        System.out.println("This is CalServlet Class Constructor");
        System.out.println("Here we are Performing Mathematical operations");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		double num1=Double.parseDouble(request.getParameter("t1"));
		double num2=Double.parseDouble(request.getParameter("t2"));
		String str=request.getParameter("op");
		double res=0;
		if(str.equals("+"))
		{
			res=num1+num2;
			System.out.println("Addition of two given numbers is :"+res);
		}
		else if(str.equals("-"))
		{
			res=num1-num2;
			System.out.println("Substraction of two given numbers is :"+res);
		}
		else if(str.equals("*"))
		{
			res=num1*num2;
			System.out.println("Multiplication of two given numbers is :"+res);
		}
		else
		{
			res=num1/num2;
			System.out.println("Division of two given numbers is :"+res);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
