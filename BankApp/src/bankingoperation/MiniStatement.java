package bankingoperation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MiniStatement extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		String ministmt =req.getParameter("givenuserid");
//		PrintWriter pw=resp.getWriter();
		
		if(ministmt!="")
		{
			resp.sendRedirect("ministatement.html");
		}
		
	}

	
}
