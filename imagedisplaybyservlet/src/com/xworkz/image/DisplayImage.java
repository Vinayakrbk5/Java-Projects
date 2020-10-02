package com.xworkz.image;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/displayimage")
public class DisplayImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter pw=response.getWriter();
		StringBuilder sb=new StringBuilder("<html><body>");
		sb.append("<img src='C:\\Users\\AAKASH\\Desktop\\JDBC_Tutorial\barbecue.png'>");
		sb.append("</body></html>");
//		pw.print(sb);
		
	}

}
