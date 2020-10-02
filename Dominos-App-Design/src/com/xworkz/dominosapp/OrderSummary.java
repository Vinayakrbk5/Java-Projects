package com.xworkz.dominosapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/OrderSummary")
public class OrderSummary extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Start of Ordersummary page");
		ServletContext context=request.getServletContext();
		String driver=context.getInitParameter("dbdriver");
		String url=context.getInitParameter("dburl");
		String user=context.getInitParameter("dbuser");
		String password=context.getInitParameter("dbpassword");
		String sqlquery1="select * from order_details;";
		String sqlquery2="select * from  address_table;";
		String sqlquery3="select sum(price) from order_details;";
		String sqldate="select curdate(); ";
		String sqltime="select curtime();";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter pw=response.getWriter();
		StringBuilder sb=new StringBuilder();
		try(Connection conn=DriverManager.getConnection(url, user, password);
				PreparedStatement prestmt4=conn.prepareStatement(sqldate);
				PreparedStatement prestmt5=conn.prepareStatement(sqltime))
				{
			ResultSet result4=prestmt4.executeQuery();
			ResultSet result5=prestmt5.executeQuery();
			while(result4.next())
			{
				String date=result4.getString(1);
			while(result5.next())
			{
				String time=result5.getString(1);
		
		 sb.append("<html><body bgcolor='skyblue'>");
		sb.append("<big style='margin-left:30px'>Thank you for your order </big><h3 style='margin-left:60%'>"+date+" || "+time+"</h3>");
		sb.append("<h2 style='margin-left:50px'> Order Confirmed</h2>");
				}}}
		catch (SQLException e) {
			e.printStackTrace();
		}	
		
		try(Connection conn=DriverManager.getConnection(url, user, password);
				PreparedStatement prestmt1=conn.prepareStatement(sqlquery1);
				PreparedStatement prestmt2=conn.prepareStatement(sqlquery2);
				PreparedStatement prestmt3=conn.prepareStatement(sqlquery3);)
		{
			ResultSet result1=prestmt1.executeQuery();
			ResultSet result2=prestmt2.executeQuery();
			ResultSet result3=prestmt3.executeQuery();
			
			
			while(result2.next()) {
			String name=result2.getString(1);
			String phone=result2.getString(2);
			String address=result2.getString(3);
			
			sb.append("<big style='margin-left:30px'>Order Summary</big>");
			sb.append("<h3 style='margin-left:30px'> Delivery Address</h3>");
			sb.append("<div style='margin-left:40px'>"+name+"</div>");
			sb.append("<div style='margin-left:40px'>Phone: "+phone+"</div>");
			sb.append("<div style='margin-left:40px'>"+address+"</div>");
			}
			
			sb.append("<h2 style='margin-left:30px'>Order Items</div>");
			
			sb.append("<table style='margin:30px:padding:20px;width:80%'><thead>");
			sb.append("<tr>");
			sb.append("<th style='text-align:center;border-bottom: 1px solid black'>Item No</th>");
			sb.append("<th style='text-align:center;border-bottom: 1px solid black'>Item Name</th>");
			sb.append("<th style='text-align:center;border-bottom: 1px solid black'>Size</th>");
			sb.append("<th style='text-align:center;border-bottom: 1px solid black'>Qty</th>");
			sb.append("<th style='text-align:center;border-bottom: 1px solid black'>Amount</th>");
			sb.append("</tr><thead><tbody>");
			while(result1.next())
			{
				sb.append("<tr>");
				sb.append("<td style='text-align:center;border-bottom: 1px solid black'>"+result1.getInt(1)+"</td>");
				sb.append("<td style='text-align:center;border-bottom: 1px solid black'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+result1.getString(2)+"</td>");
				sb.append("<td style='text-align:center;border-bottom: 1px solid black'>"+result1.getString(3)+"</td>");
				sb.append("<td style='text-align:center;border-bottom: 1px solid black'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+result1.getInt(4)+"</td>");
				sb.append("<td style='text-align:center;border-bottom: 1px solid black'>"+result1.getInt(5)+"</td>");
				sb.append("</tr>");
				
			}
			sb.append("<tr><td></td><td></td><td></td>");
			sb.append("<td style='text-align:center;border-bottom: 1px solid black'>Sub Total:</td>");
			while(result3.next())
			{
			sb.append("<td style='text-align:center;border-bottom: 1px solid black'>"+result3.getInt(1)+"</td></tr>");
			sb.append("<tr><td></td><td></td><td></td>");
			sb.append("<td style='text-align:center;border-bottom: 1px solid black'>CGST @ 2.5% :</td>");
			sb.append("<td style='text-align:center;border-bottom: 1px solid black'>"+result3.getInt(1)*(.025)+"</td></tr>");
			
			sb.append("<tr><td></td><td></td><td></td>");
			sb.append("<td style='text-align:center;border-bottom: 1px solid black'>SGST @ 2.5% :</td>");
			sb.append("<td style='text-align:center;border-bottom: 1px solid black'>"+result3.getInt(1)*(.025)+"</td></tr>");
			

			sb.append("<tr><td></td><td></td><td></td>");
			sb.append("<td style='text-align:center;border-bottom: 1px solid black'>Grand Total :</td>");
			int res=(int) (result3.getInt(1)*(.05)+result3.getInt(1));
			sb.append("<td style='text-align:center;border-bottom: 1px solid black'>"+res+".00</td></tr>");
			
			}
			sb.append("</tbody></table>");
			pw.print(sb);
			
			
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		System.out.println("End of Ordersummary page");
	
	}

}
