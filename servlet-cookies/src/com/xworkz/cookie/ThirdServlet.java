package com.xworkz.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/thirdservlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	 String uname=request.getParameter("username");
		
		Cookie c=new Cookie("name","Hello Vinayak");
		PrintWriter pw=response.getWriter();
//		pw.print(c);
	
	}

}
