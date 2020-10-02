package Com.Xworkz.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorEx extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String numstr1 = req.getParameter("num1");
		String numstr2 = req.getParameter("num2");
		PrintWriter pw = resp.getWriter();
		StringBuilder sb = new StringBuilder();
		sb.append("<html><body>");
		if (numstr1 == "" || numstr2 == "") {
			sb.append("<div> <h2>You have missed number to Enter.<a href='calculator.html'>goto</a></h2></div>");
		} else {
			int num1 = Integer.parseInt(numstr1);
			int num2 = Integer.parseInt(numstr2);

			String operation = req.getParameter("op");
			if (operation.equals("addition")) {
				sb.append(
						"<div><h1><i> Addition </i> of two numbers [" + num1 + "] and [" + num2 + "] is :<b>[" + (num1 + num2)+"]</b>");
			} else if (operation.equals("substraction")) {
				sb.append("<div><h1><i> substraction </i> of two numbers [" + num1 + "] and [" + num2 + "] is :<b>["
						+ (num1 - num2)+"]</b>");
			} else if (operation.equals("multiflication")) {
				sb.append("<div><h1><i> Multiplication </i> of two numbers " + num1 + " and " + num2 + " is :<b>["
						+ (num1 * num2)+"]</b>");
			} else if (operation.equals("division")) {
				sb.append(
						"<div><h1><i> division </i> of two numbers " + num1 + " and " + num2 + " is :<b>[" + (num1 / num2)+"]</b>");
			}

		}
		sb.append("</body></html>");
		pw.print(sb);

	}

}
