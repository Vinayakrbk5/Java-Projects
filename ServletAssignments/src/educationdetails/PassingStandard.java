package educationdetails;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PassingStandard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("uname");

		String standard = req.getParameter("std");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
//		pw.print(name);
//		pw.print(standard);
//		int kanmarks=Integer.parseInt(req.getParameter("n"));

//		int kanmarks = Integer.parseInt(req.getParameter("Kmark"));
//		int engmarks = Integer.parseInt(req.getParameter("Emark"));
//		int hinmarks = Integer.parseInt(req.getParameter("Hmark"));
//		int mathmarks = Integer.parseInt(req.getParameter("Mmark"));
//		int scmarks = Integer.parseInt(req.getParameter("Smark"));
//		int sscmarks = Integer.parseInt(req.getParameter("SSmark"));

		String kanmarks1=req.getParameter("Kmark");
		String engmarks1=req.getParameter("Emark");
		String hinmarks1=req.getParameter("Hmark");
		String mathmarks1=req.getParameter("Mmark");
		String scmarks1=req.getParameter("Smark");
		String sscmarks1=req.getParameter("SSmark");

		int kanmarks,engmarks,hinmarks,mathmarks,scmarks,sscmarks;
//		int kanmarks=Integer.parseInt(kanmarks1);
//		int engmarks=Integer.parseInt(engmarks1);
//		int hinmarks=Integer.parseInt(hinmarks1);
//		int mathmarks=Integer.parseInt(mathmarks1);
//		int scmarks=Integer.parseInt(scmarks1);
//		int sscmarks=Integer.parseInt(sscmarks1);
		
		StringBuilder sb = new StringBuilder("<html><body style='background:rgba(178,230,200,.5);margin:150px'>");
		if(name=="" || standard==""|| kanmarks1=="" || engmarks1=="" ||hinmarks1=="" || mathmarks1 =="" || scmarks1=="" || sscmarks1=="")
		{
				sb.append("<h1> You have missed some Entries, So please enter missed one <a href='marksdetails.html'>goto</a></h1>");
			
//			kanmarks=engmarks=hinmarks=mathmarks=scmarks=sscmarks=0;
//			if(name!="" && standard!="" && kanmarks!=0)
		}
		else
		{
			 kanmarks=Integer.parseInt(kanmarks1);
			 engmarks=Integer.parseInt(engmarks1);
			 hinmarks=Integer.parseInt(hinmarks1);
			 mathmarks=Integer.parseInt(mathmarks1);
			 scmarks=Integer.parseInt(scmarks1);
			 sscmarks=Integer.parseInt(sscmarks1);
		
		
		if (kanmarks >= 35 && engmarks >= 35 && hinmarks >= 35 && mathmarks >= 35 && scmarks >= 35 && sscmarks >= 35) {
			int sum = kanmarks + engmarks + hinmarks + mathmarks + scmarks + sscmarks;
			double percentage = sum / 6;
			sb.append("<header style='border:2px solid inset;color:red;font-size:50px;text-align:center'> "
					+ "&spades;&nbsp;<u><b>Central Board of Secondary Education</b></u> &spades;</header>");
//			pw.print(name+" is of "+standard);
			sb.append("<main style='margin:50px'><br><br><div style='font-size:40px;color:rgba(100,200,100,.8);text-align:center'>"
					+ " <i>Progress Certificate</i> </div>");
			sb.append("<div style='font-family:courier;text-align:center'> <h3><i>This is to Certify that </i></h3></div>");
			sb.append("<div><h2><u><i>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;_____________" + name + "______________________________</i> </u></h2></div>");
			sb.append("<div><h2> &nbsp;&nbsp;&nbsp;of the M.V.Pattan HighSchool and Pre-University College,Rabkavi-587314 Dist:Bagalkot</h2></div>");
			sb.append("<div><h2>&nbsp;&nbsp;&nbsp;has scored " + percentage + "% and satisfactorily completed " + standard
					+ " in 2019-2020 </h2></div>"
					+ "<div><h2> &nbsp;&nbsp;&nbsp;and is eligible for entrance text for next higher Standard</h2></div>");
			sb.append("<br><br><div><h1>&nbsp;&nbsp;&nbsp;Congragulations </h1></div>");
			sb.append("<div><h3 style='float:right'> Director of  Secondary Education,Karnataka</h3></div>");
			sb.append("</main>");
		} else {
			int sum = kanmarks + engmarks + hinmarks + mathmarks + scmarks + sscmarks;
			double percentage = sum / 6;
			sb.append("<div><h1><i>"+name+" </i>has scored " + percentage + "% in " + standard
					+ " but has failed because of marks less than 35 and is not eligible for entrance text for next higher Standard.</h1></div>");
			sb.append("<div> <h1>He has to reappear for same class for next year also.</h1></div> ");
		}
		
		}

		sb.append("</body></html>");
		pw.print(sb);

	}

}
