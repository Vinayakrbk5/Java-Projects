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

public class DeleteDbEntry  extends HttpServlet{

	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw=resp.getWriter();
		StringBuilder sb=new StringBuilder();
		
		String deletequery="delete from oldagehome where id =?;";
		
		ServletContext context=getServletContext();
		String url=context.getInitParameter("dburl");
		String user=context.getInitParameter("dbuser");
		String password=context.getInitParameter("dbpassword");
		String driver=context.getInitParameter("dbdriver");
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String personid=req.getParameter("number");
		 sb.append("<html><body style='background:rgba(200,100,100,.2)'>");
		
		if(personid!="")
		{
			int result=0;
			int id=Integer.parseInt(personid);
			try(Connection conn=DriverManager.getConnection(url, user, password);
					 PreparedStatement prestmt=conn.prepareStatement(deletequery))
			 {
				prestmt.setInt(1, id);
				result=prestmt.executeUpdate();
				if(result>0)
				{
					sb.append("<div><h1> You have Successfully deleted one entry.To check <a href='readentry.html'>Goto</a> Database</h1></div>");
				}
				else
				{
					sb.append("<div><h1> <div>You have entered wrong Person Id.</div><div> So Please Enter Correct Id."
							+ "<a href='deleteentry.html'>Goto</a></div></h1></div>");
				}
				 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			sb.append("<div><h1><div> You have not entered Person Id.</div><div> So please enter id."
					+ "<a href='deleteentry.html'>Goto</a></div></h1></div>");
		}
		
		sb.append("</body></html>");
		pw.print(sb);
		
	}


}

