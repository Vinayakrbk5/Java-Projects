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

public class SessionEx extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		
		String username=req.getParameter("username");
//		ServletContext context=req.getServletContext();
//		context.setAttribute("Vinayak", "Bhilawadi");
		
		RequestDispatcher request=req.getRequestDispatcher("SessionMappingTo");
		request.include(req, resp);
		
//		HttpSession session=req.getSession();
//		session.setAttribute("user",username);
	
//		req.setAttribute("user", username);
//		resp.sendRedirect("SessionMappingTo");
		
//		RequestDispatcher request1=req.getRequestDispatcher("end");
//		request1.forward(req, resp);
//		
		pw.print("In SessionEx Class");

		
	}
}
