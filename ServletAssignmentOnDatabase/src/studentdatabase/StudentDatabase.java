package studentdatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentDatabase extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		 String url=context.getInitParameter("dburl");
		 String user=context.getInitParameter("dbuser");
		 String password=context.getInitParameter("dbpassword");
		 String driver=context.getInitParameter("dbdriver");
		 
		 String usncode=req.getParameter("usn");
		 try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		 
		 String sqlquery="select count(*) from studentdet inner join marksdet using(usn) where usn=?";
		 String sqlquery2="select * from studentdet inner join marksdet using(usn) where usn=?";
		 StringBuilder sb=new StringBuilder();
		 
		 PrintWriter pw=resp.getWriter();
		 
		 sb.append("<html><body style='background:skyblue'>");
		 try(Connection conn=DriverManager.getConnection(url, user, password);
		 PreparedStatement prestmt=conn.prepareStatement(sqlquery);PreparedStatement prestmt1=conn.prepareStatement(sqlquery2))
		 {
			 int count=0;
			 prestmt.setString(1, usncode);
			 prestmt1.setString(1, usncode);
			 ResultSet result=prestmt.executeQuery();
			 ResultSet resultset=prestmt1.executeQuery();
			 while(result.next())
			 {
				count=result.getInt(1); 
			 }
			 
			 if(usncode=="")
			 {
				sb .append("<h1 style='text-align:center'>Enter USN Number to check for Result <a href='student.html'>goto</a></h1>");
			 }
			 else if(count==0)
			 {
				 sb.append("<h1 style='text-align:center'><div>You have Entered wrong USN.</div><div>Please Enter CorrectOne <a href='student.html'>goto</a></div></h1>");
			 }
			 else
			 {
				 while(resultset.next())
				 {
					 int usnc=resultset.getInt(1);
					 String fname=resultset.getString(2);
					 String lname=resultset.getString(3);
					 int semi=resultset.getInt(4);
					 String phone=resultset.getString(5);
					 int pmarks=resultset.getInt(6);
					 int cmarks=resultset.getInt(7);
					 int mmarks=resultset.getInt(8);
					 int csmarks=resultset.getInt(9);
					 int status=0;
					 double perc=(pmarks+cmarks+mmarks+csmarks )/4;
					 if(pmarks>=35 && cmarks>=35 && mmarks>=35 && csmarks>=35)
					 {
						 status=1;
					 }
					 
					 sb.append("<header> <h1>PUC Examination Result </h1></header>");
					 sb.append("<table style='border:2px solid black;width:90%;margin:20px'>");
					 sb.append("<thead>");
					 sb.append("<tr>");
					 sb.append("<th style='border:1px solid black;text-align:center'>USN Number </th>");
					 sb.append("<th style='border:1px solid black;text-align:center'>First Name </th>");
					 sb.append("<th style='border:1px solid black;text-align:center'>Last name </th>");
					 sb.append("<th style='border:1px solid black;text-align:center'> Semister </th>");
					 sb.append("<th style='border:1px solid black;text-align:center'>Phone Number </th>");
					 sb.append("<th style='border:1px solid black;text-align:center'> Physics </th>");
					 sb.append("<th style='border:1px solid black;text-align:center'> Chemistry </th>");
					 sb.append("<th style='border:1px solid black;text-align:center'> Mathematics </th>");
					 sb.append("<th style='border:1px solid black;text-align:center'> Computer Science </th>");
					 sb.append("</thead>");
					 sb.append("<tbody>");
					 sb.append("<tr>");
					 sb.append("<td style='border:1px solid black;text-align:center'>"+usnc+"</td>");
					 sb.append("<td style='border:1px solid black;text-align:center'>"+fname+"</td>");
					 sb.append("<td style='border:1px solid black;text-align:center'>"+lname+"</td>");
					 sb.append("<td style='border:1px solid black;text-align:center'>"+semi+"</td>");
					 sb.append("<td style='border:1px solid black;text-align:center'>"+phone+"</td>");
					 sb.append("<td style='border:1px solid black;text-align:center'>"+pmarks+"</td>");
					 sb.append("<td style='border:1px solid black;text-align:center'>"+cmarks+"</td>");
					 sb.append("<td style='border:1px solid black;text-align:center'>"+mmarks+"</td>");
					 sb.append("<td style='border:1px solid black;text-align:center'>"+csmarks+"</td>");
					 sb.append("<tbody>");
					 sb.append("</table>"); 
					 
					 
					 if(status==1)
					 {
						 sb.append("<span> <h2>Stutus :<i>Pass</i> and Percentage :<i>"+perc+"%</i></h2></span>");
					 }
					 else
					 {
						 sb.append("<span> <h2>Stutus :<i>Fail</i> and Percentage :<i>"+perc+"%</i></h2></span>"); 
					 }
					 
					 sb.append("<h3><u><a href='#'>Print</a></u></h3>");
				 }
			 }
			 
		 }catch (SQLException e) {
				e.printStackTrace();
			}
		 
		 
		 sb.append("</body></html>");
		 pw.print(sb);
		
	}

}
