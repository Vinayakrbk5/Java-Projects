package com.xworkz.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter pw=resp.getWriter();
		pw.print("This is Vinayak");
		ServletContext context=req.getServletContext();
		String str2=context.getInitParameter("driver");
		pw.print(str2);
				
				}
	public String display()
	{
		return "Vinayak";
	}
}
