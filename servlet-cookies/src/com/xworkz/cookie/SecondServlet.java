package com.xworkz.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//		
//		String name=request.getAttribute("username").toString();
		HttpSession session=request.getSession();
		String name=session.getAttribute("uname").toString();
		PrintWriter pw=response.getWriter();
		String name1=request.getParameter("username");
	Cookie[] ck=request.getCookies();
	for(Cookie c:ck)
	{
		pw.println("Cookie Name is :"+c.getName());
		pw.println("Cookie Value is :"+c.getValue());
	}
	pw.println("session name is : second servlet"+name);
	pw.print("parameter value is :"+name1);
	
	
	
	
//	
//	String username=request.getParameter("username");
	
	}

}
