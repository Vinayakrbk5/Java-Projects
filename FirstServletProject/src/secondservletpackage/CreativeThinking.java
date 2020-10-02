package secondservletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreativeThinking  extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String message2="\n Here You will going to learn Html and Servlet\n";
			String massage1="\t This is X-workz institution which is located in Dr.Rajkumar Road,Rajajinagar,Bangalore-76\n";
			String message3="\n This institution provides good technical knowledge,\n "
					+ "who are going to become a Software Devoloper and as wella as Tester\n";
			StringBuilder br=new StringBuilder();
			br.append(massage1);
			br.append("\n"+message2);
			br.append("\n"+message3);
			String htmlcont="<html><body> <big>"+br+"</big> </body></html>";
			
			resp.setContentType("text/html");
			PrintWriter pw=resp.getWriter();
			
			pw.print(htmlcont);
		}


}
