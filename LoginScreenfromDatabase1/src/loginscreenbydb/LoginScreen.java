package loginscreenbydb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	public class LoginScreen extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		ServletConfig config=getServletConfig();
		ServletContext context=getServletContext();
		String email=context.getInitParameter("contactemail");
		String phone=context.getInitParameter("contactphone");
		

//		String url = "jdbc:mysql://localhost:3306/practicesql";
//		String user = "root";
//		String password1 = "xworkz";
		
		String driver=config.getInitParameter("dbdriver");
		String url = config.getInitParameter("dburl");
		String user = config.getInitParameter("dbuser");
		String password1 = config.getInitParameter("dbpassword");

		String sqlquery = "select count(*) from Person where username=? and passw=?";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try (Connection conn = DriverManager.getConnection(url, user, password1);
				PreparedStatement prestmt = conn.prepareStatement(sqlquery)) {

			prestmt.setString(1, username);
			prestmt.setString(2, password);
			ResultSet res = prestmt.executeQuery();

			PrintWriter pw = resp.getWriter();

			StringBuilder out = new StringBuilder();
			out.append("<html>");
			out.append("<body style=\"background:lightgreen\">");
			out.append("<h1>");
			while (res.next()) {
				if (res.getInt(1) > 0) {
					out.append("You have \" successfully \" logged in");
				} else {
					out.append("Incorrect credentials so plz Enter Again:");
					out.append("<a href='index.html'>Login Again</a>");
					
				}
				out.append("<footer><p> Email id:"+email+"</p></footer>");
				out.append("<footer><p> Email id:"+phone+"</p></footer>");
				out.append("<h1>");
				out.append("<body>");
				out.append("<html>");
				pw.print(out);

				

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
