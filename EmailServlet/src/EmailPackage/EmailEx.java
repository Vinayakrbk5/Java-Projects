package EmailPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmailEx")
public class EmailEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   
    public EmailEx() {
        super();
        System.out.println("This is EmailEx class constructor");
        System.out.println("Hello Bangalore");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("Name");
		String pass=request.getParameter("id");
		System.out.println("Given name :"+name);
		System.out.println("Given Password :"+pass);
//		PrintWriter pr=response.getWriter();
//		pr.println("Given name :"+name);
//		pr.println("Given Password :"+pass);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}


}
