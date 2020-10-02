package Com.Xworkz.oldagehomeapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/readentry")
public class ReadDBEntry extends HttpServlet {


	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		ServletContext context=getServletContext();
		String driver=context.getInitParameter("dbdriver");
		String url=context.getInitParameter("dburl");
		String user=context.getInitParameter("dbuser");
		String password=context.getInitParameter("dbpassword");
		
		String selectquery="select * from OldAgeHome;";
	
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		PrintWriter pw=resp.getWriter();
		StringBuilder sb=new StringBuilder();
		sb.append("<htm><body style='background:lightgreen'>");
		sb.append("<h1> Details of the People residing in the OldAgeHome :</h1>");
		sb.append("<table style='border:2px solid black;width:90%;margin:20px'>");
		 sb.append("<thead>");
		 sb.append("<tr>");
		 sb.append("<th style='border:1px solid black;text-align:center'> Id </th>");
		 sb.append("<th style='border:1px solid black;text-align:center'> Name </th>");
		 sb.append("<th style='border:1px solid black;text-align:center'>Age </th>");
		 sb.append("<th style='border:1px solid black;text-align:center'> HealthCondition </th>");
		 sb.append("<th style='border:1px solid black;text-align:center'>Contact Number </th>");
		 sb.append("<th style='border:1px solid black;text-align:center'> Address </th>");
		 sb.append("</thead>");
		 sb.append("<tbody>");
		
		try(Connection conn=DriverManager.getConnection(url, user, password);
				PreparedStatement prestmt=conn.prepareStatement(selectquery);ResultSet result=prestmt.executeQuery())
		{
			
			while(result.next())
			{
				sb.append("<tr><td style='border:1px solid black;text-align:center'>"+result.getInt(1)+"</td>");
				sb.append("<td style='border:1px solid black;text-align:center'>"+result.getString(2)+"</td>");
				sb.append("<td style='border:1px solid black;text-align:center'>"+result.getInt(3)+"</td>");
				sb.append("<td style='border:1px solid black;text-align:center'>"+result.getString(4)+"</td>");
				sb.append("<td style='border:1px solid black;text-align:center'>"+result.getString(5)+"</td>");
				sb.append("<td style='border:1px solid black;text-align:center'>"+result.getString(6)+"</td>");
				sb.append("</tr>");	
			}
			sb.append("</tbody");
			sb.append("</body></html>");
			pw.print(sb);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
}
