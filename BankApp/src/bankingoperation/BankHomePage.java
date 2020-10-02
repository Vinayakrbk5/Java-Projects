package bankingoperation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

public class BankHomePage extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String userid = req.getParameter("userid");
		String select = req.getParameter("select");
		resp.setContentType("text/html");
		System.out.println("Entered into Banking HomePage");

		System.out.println("UserId is :"+userid);
		System.out.println("selected option is : "+select);
		System.out.println("redirecting to another page");
		PrintWriter pw=resp.getWriter();
		StringBuilder sb=new StringBuilder();
		sb.append("<html><body>");
		
		if (userid != "" && select != "") {
			if (select.equals("balance")) {
				RequestDispatcher dispatch = req.getRequestDispatcher("/tobalancecheck");
				req.setAttribute("givenuserid", userid);
				dispatch.forward(req, resp);
				
				ServletContext context=getServletContext();
				 context.setAttribute("Vinayak", "Vin");
				req.getServletContext().setAttribute("User1", "Vinayak");
//				String name =(String) getServletContext().getAttribute("User1");
				
//				HttpSession session=req.getSession(false); // returns existing session
//				HttpSession session1=req.getSession(true); // creates new session
//				HttpSession session3=req.getSession();  // returns existing session else creates new session
//				session.setAttribute("sname", "scope1");
			}
			else if(select.equals("ministmt"))
			{
				RequestDispatcher dispatch =req.getRequestDispatcher("/ministmt");
				req.setAttribute("givenuserid", userid);
				dispatch.forward(req, resp);
			}
			else if(select.equals("contactdetails"))
			{
				resp.sendRedirect("contactdetails.html");
			}
			else
			{
				sb.append("<h1> You have not selected any option.<a href='banklogin.html'>Goto</a></h1>");
			}
		}
		else {
//			resp.sendRedirect("banklogin.html");
			sb.append("<html><body><div><h2> You have not Entered all details.</div><div>"
					+ "So please enter UserId.<a href='banklogin.html'>goto</a></div></h2></body></html>");
			
		}
		sb.append("</body></html>");
		pw.print(sb);
		
	}
}
