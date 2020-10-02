package Com.Xworkz.oldagehomeapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateNewEntry extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		System.out.println("Entered into create new entry class");
		
		String personid=req.getParameter("id");
		String pname=req.getParameter("name");
		String perage=req.getParameter("age");
		String healthcond=req.getParameter("health");
		String phone=req.getParameter("phone");
		String address=req.getParameter("address");
		
		
		
		ServletContext context=getServletContext();
		String driver=context.getInitParameter("dbdriver");
		String url=context.getInitParameter("dburl");
		String user=context.getInitParameter("dbuser");
		String password=context.getInitParameter("dbpassword");
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		PrintWriter pw=resp.getWriter();
		StringBuilder sb=new StringBuilder();
		sb.append("<html><body>");
		
		
		if(personid!="" && pname!="" && perage!="" && healthcond!="" && phone!="" && address!="")
		{
			int pid=Integer.parseInt(personid);
			int page=Integer.parseInt(perage);
			String insertquery="insert into OldAgeHome values(?,?,?,?,?,?);";
			try(Connection conn=DriverManager.getConnection(url, user, password);
					PreparedStatement prestmt=conn.prepareStatement(insertquery))
			{
				prestmt.setInt(1, pid);
				prestmt.setString(2, pname);
				prestmt.setInt(3, page);
				prestmt.setString(4, healthcond);
				prestmt.setString(5,phone );
				prestmt.setString(6, address);
				prestmt.executeUpdate();
				sb.append("<h1><div>One New Entry is Created.</div>If you want to check <a href='readentry.html'>Goto</a> DataBase.</h1>");
				
			} catch (SQLException e) {
				sb.append("<h1><div> Something went wrong.</div><div>Please reenter all the information."
						+ "<a href='createentry.html'>Goto</a></div></h1>");
			}
			
			
		}
		else
		{
			sb.append("<h1> <div>You have missed Some Entries.</div><div>Please fill all the entries,"
					+ "<a href='createentry.html'>goto Create Entry Page </a></div>");
		}
		sb.append("</body></html>");
		pw.print(sb);
	}
	
}
