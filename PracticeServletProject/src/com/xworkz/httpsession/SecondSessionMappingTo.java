package com.xworkz.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondSessionMappingTo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
//		ServletContext context=req.getServletContext();
//		String str=context.getAttribute("Vinayak").toString();
		String name=req.getParameter("username");
		pw.print("In SecondSessionMappingTo Class : Bangalore "+name);

//	
//	HttpSession session=req.getSession();
//	String name=session.getAttribute("user").toString();
		
	}


}
