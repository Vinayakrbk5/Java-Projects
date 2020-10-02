package Com.Xworkz.oldagehomeapp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OldAgeHomePage extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
//		String selected=req.getParameter("select");
		String update=req.getParameter("update");
		String delete=req.getParameter("delete");
		String create=req.getParameter("create");
		String read=req.getParameter("read");
		
//		if(selected!="")
//		{
			if(create!=null)
			{
				resp.sendRedirect("createentry.html");
			}
			else if(read!=null)
			{
				RequestDispatcher request=req.getRequestDispatcher("readentry");
				request.forward(req, resp);
			}
			else if(update!=null)
			{
				resp.sendRedirect("updateentry.html");
			}
			else if(delete!=null) 
			{
			resp.sendRedirect("deleteentry.html");	
			}
			
//		}
//		else
//		{
//			System.out.println("Bhilawadi");
//			resp.sendRedirect("oldagehomepage.html");
//		}
	}
}
