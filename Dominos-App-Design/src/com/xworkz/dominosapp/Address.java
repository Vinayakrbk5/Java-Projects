package com.xworkz.dominosapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/address")
public class Address extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Start of Address Page");
		String name=request.getParameter("name");
		String phone=request.getParameter("number");
		String address=request.getParameter("address");
		
		ServletContext context=request.getServletContext();
		String driver=context.getInitParameter("dbdriver");
		String url=context.getInitParameter("dburl");
		String user=context.getInitParameter("dbuser");
		String password=context.getInitParameter("dbpassword");
		String sqlquery="insert into address_table values(?,?,?);";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(Connection conn=DriverManager.getConnection(url, user, password);
				PreparedStatement prestmt1=conn.prepareStatement(sqlquery))
		{
			prestmt1.setString(1, name);
			prestmt1.setString(2, phone);
			prestmt1.setString(3, address);
			prestmt1.executeUpdate();
		}
	catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		finally {
			RequestDispatcher dispatch=request.getRequestDispatcher("OrderSummary");
			dispatch.forward(request, response);
		}
		
		System.out.println("End of Address Page");
	}

}
