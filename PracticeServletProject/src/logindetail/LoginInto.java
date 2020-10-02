package logindetail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInto extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		PrintWriter pw = resp.getWriter();

		if (username == "")// || password == "") {
		{
			pw.print("Enter UserName");
			
		}
		else if (username != "Vinayak") {
			pw.print("Enter Correct UserName");
		}
		else if (password == "") {
			pw.print("Enter Password");
			
		}
		else if (username != "vinu@2020") {
			pw.print("Enter Correct Password");
		}
		else if (username.equals("Vinayak") && password.equals("vinu@2020")) {

			pw.print("You have Successfully Logged in");
		}
	}

}
