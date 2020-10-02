package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		 String hellomsg="Hello!! Welcome To India";
		 String htmlcontent="<html> <body> <h1>"+hellomsg+"</h1></body></html>";
		 resp.setContentType("text/html");
		 
		 PrintWriter pw=resp.getWriter();
		 pw.print(htmlcontent);
		  
	 }

}
