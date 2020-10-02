package Com.Xworkz.oldagehomeapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateDBEntry extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html");
	PrintWriter pw=resp.getWriter();
	StringBuilder sb=new StringBuilder();
	
	String personid=req.getParameter("number");
	String selected=req.getParameter("select");
	String newvalue=req.getParameter("newfieldvalue");
	
	ServletContext context=getServletContext();
	String url=context.getInitParameter("dburl");
	String user=context.getInitParameter("dbuser");
	String password=context.getInitParameter("dbpassword");
	String driver=context.getInitParameter("dbdriver");
	
	try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sb.append("<html><body style='background:rgba(178,190,200,.7'>");
	try(Connection conn=DriverManager.getConnection(url, user, password);
			Statement stmt=conn.createStatement())
	{
		
	
	if(personid!="" && selected!="" && newvalue!="")
	{
		int res=0;
		int pid=Integer.parseInt(personid);
//		if(selected.equals("PersonName"))
//		{
			res=stmt.executeUpdate("Update OldAgeHome set "+selected+"='"+newvalue+"' where id="+pid+";");
			if(res>0)
			{
		sb.append("<div><big><b>"+selected+"</b> field in the DataBase is Updated.To check "
				+ "<a href='readentry.html'>Goto</a> Database</big></div>");
			}
			else
			{
				sb.append("<div><big><div>You have entered wrong field.</div><div>"
						+ "So <a href='updateentry.html'> Goto</a></div></big></div>");
				
			}
//		}
//		else if(selected.equals("Age"))
//		{
//			int newage=Integer.parseInt(newvalue);
//			stmt.executeUpdate("Update OldAgeHome set "+selected+"='"+newage+"' where id="+pid+";");
//			sb.append("<div><big><b>Age</b> field in the DataBase is Updated.</big></div>");
//			
//		}
//		else if(selected.equals("MedCondition"))
//		{
//			stmt.executeUpdate("Update OldAgeHome set "+selected+"='"+newvalue+"' where id="+pid+";");
//			sb.append("<div><big><b>MedCondition</b> field in the DataBase is Updated.</big></div>");
//		}
//		else if(selected.equals("phone"))
//		{
//			stmt.executeUpdate("Update OldAgeHome set "+selected+"='"+newvalue+"' where id="+pid+";");
//			sb.append("<div><big><b>Phone</b> field in the DataBase is Updated.</big></div>");
//		}
//		else if(selected.equals("address"))
//		{
//			stmt.executeUpdate("Update OldAgeHome set "+selected+"='"+newvalue+"' where id="+pid+";");
//			sb.append("<div><big><b>Address</b> field in the DataBase is Updated.</big></div>");
//		}
//		else
//		{
//			sb.append("<div><h1> You have Entered Something wrong.</div><div> So Please Enter Correctly."
//					+ "<a href='updateentry.html'>Goto</a></h1></div>");
//		}
			
		
	}
	
	else
	{
		sb.append("<div><h1> <div>You have missed Some Entry.</div><div>So Please enter missed one"
				+ ".<a href='updateentry.html'>Goto update page</a></div></h1></div>");
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	sb.append("</body></html>");
	pw.print(sb);
	}




}
