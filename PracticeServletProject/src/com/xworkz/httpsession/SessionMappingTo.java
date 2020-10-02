package com.xworkz.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionMappingTo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		RequestDispatcher request1=req.getRequestDispatcher("end");
		request1.include(req, resp);
		
//		HttpSession session=req.getSession();
//		String name=session.getAttribute("user").toString();
		String name=req.getParameter("username");
//		String str=getServletContext().getAttribute("Vinayak").toString();
//		resp.sendRedirect("end");
//		pw.print("In SessionMappingTo Class My Surname is "+name);
//		ServletContext context=req.getServletContext();
//		String str=context.getAttribute("Vinayak").toString();
		pw.print("In SessionMappingTo Class : Bangalore "+name);
	}

}
