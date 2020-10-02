package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter pw=resp.getWriter();

		StringBuilder out = new StringBuilder();
		out.append("<html>");
		out.append("<body style=\"background:lightgreen\">");
		out.append("<h1>");
		if (username != "" && password != "") {
			if (username.equals("Vinayak") && password.equals("vinu@123")) {
				out.append("You have \" successfully \" logged in");
			} else {
				out.append("Incorrect credentials so plz Enter Again:");
				out.append("<a href='login.html'>Login Again</a>");
			}
		} else {
			out.append("Enter UserName and Password");
			out.append("<a href='login.html'>Login Again</a>");
		}
		
		out.append("<h1>");
		out.append("<body>");
		out.append("<html>");
		
		pw.print(out);

	}
}
