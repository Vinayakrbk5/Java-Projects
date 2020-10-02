package com.xworkz.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		String username=request.getParameter("username");
		HttpSession session=request.getSession();
		session.setAttribute("uname", "India");
		
		Cookie c=new Cookie("username", "cooky_google");
		c.setMaxAge(600);
		response.addCookie(c);
//		PrintWriter pw=response.getWriter();
//		pw.print("User Name is :"+username);
//		StringBuilder sb=new StringBuilder();
		
//		RequestDispatcher dispatch=request.getRequestDispatcher("servlet2");
//		request.setAttribute("username", username);
//		dispatch.forward(request, response);
		
		response.sendRedirect("servlet2");
//		sb.append("<html><body>");
//		sb.append("<form action='servlet2' method ='post'>");
//		sb.append("<input type='submit' value='go'>");
//		sb.append("</form>");
//		sb.append("</body></html>");
//		pw.print(sb);
	}

}
