package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreativeThinking extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mes="backgrond:lightgreen";
		String message="<h3 style:"+mes+"><i><u>About Xworkz</u></i></h3>";
		String massage1=" <div><p>&hArr;This is <b><i>X-workz</i></b> institution which is located in <b>Dr.Rajkumar Road,Rajajinagar,Bangalore-76</b>.</p></div>";
		String message2=" <div><p> &hArr;Here You will going to learn  <b>Core java, SQL, Html, Servlet</b> etc.</p></div>";
		
		String message3="<div><p><div>&hArr; This institution provides <b>good technical knowledge</b>,</div>"
				+ "<div><p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;who wants to become a <b><i>Software Developer</i></b> and as well as a <b><i>Tester</i></b>.</p></div></p></div>";
		String message4="<div><p>&hArr;If you are interested to learn fill the <b>Application form</b> and <b>Submit</b>.</p></div>";
		String message5="<div><div> <h3><i>&hearts;Thank You &hearts;</i></h3></div></div>";
		StringBuilder br=new StringBuilder();
		br.append(message);
		br.append(massage1);
		br.append(message2);
		br.append(message3);
		br.append(message4);
		br.append(message5);
		String htmlcont="<html><body> <big>"+br+"</big> </body></html>";
		
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		
		pw.print(htmlcont);
	}
}
