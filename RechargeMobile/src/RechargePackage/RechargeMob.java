package RechargePackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RechargeMob")
public class RechargeMob extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RechargeMob() {
        super();
        System.out.println("Here We are Performing Mobile Recharge Operation");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		long num=Long.parseLong(request.getParameter("mobno"));
		String str=request.getParameter("op");
		int count=0;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		System.out.println("Given Mobile number has "+count+" digits");
		if(count==10)
		{
			if(str.equals("Idea"))
			{
			System.out.println("Recharge to Idea Sim is Successful");
			} 
			else if(str.equals("Airtel"))
			{
			System.out.println("Recharge to Airtel Sim is Successful");
			} 
			else if(str.equals("Jio"))
			{
			System.out.println("Recharge to Jio Sim is Successful");
			}
			else if(str.equals("Reliance"))
			{
			System.out.println("Recharge to Reliance Sim is Successful");
			} 
			else if(str.equals("BSNL"))
			{
			System.out.println("Recharge to BSNL Sim is Successful");
			} 
			else if(str.equals("Vodafone"))
			{
			System.out.println("Recharge to Vodafone Sim is Successful");
			} 
			else
			{
				System.out.println("Recharge to TataDocomo Sim is Successful");
			}
			
		}
		else
		{
			System.out.println("Invalid Mobile number");
		}
		System.out.println("------------------------------------");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("This is dopost method");
		System.out.println("Here we are performing recharge operation");
	}

}
