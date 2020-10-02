package bankingoperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckBalance extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html");
	String recievedid=(String) req.getAttribute("givenuserid");
	
	System.out.println("Entered into Check Balance page");
	System.out.println("UserId got here is :"+recievedid);
	PrintWriter pw=resp.getWriter();
	System.out.println("Leaving Balance Check Page ");
	
	if(recievedid!="")
	{
		pw.print("<html><body><big> The user with UserId <b>"+recievedid+"</b> is <b>10000.00</b></body></html>");
	}
	}
}
