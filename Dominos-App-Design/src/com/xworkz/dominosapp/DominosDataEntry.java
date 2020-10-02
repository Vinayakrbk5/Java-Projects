package com.xworkz.dominosapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DominosDataEntry
 */
@WebServlet("/domonosdataentry")
public class DominosDataEntry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Start of DomonosDataEntry page");
		ServletContext context=request.getServletContext();
		String driver=context.getInitParameter("dbdriver");
		String url=context.getInitParameter("dburl");
		String user=context.getInitParameter("dbuser");
		String password=context.getInitParameter("dbpassword");
		String sqlquery="insert into order_details(ITEM_NAME,SIZE,QUANTITY,PRICE)"
				+ "values(?,?,?,?);";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String maxgreen=request.getParameter("maxgreen");
		String pepaneer=request.getParameter("pepaneer");
		String indipaneer=request.getParameter("indipaneer");
		String fiesta=request.getParameter("fiesta");
		String supreme=request.getParameter("supreme");
		String dominator=request.getParameter("dominator");
		String capsicum=request.getParameter("capsicum");
		String corn=request.getParameter("corn");
		String vegloaded=request.getParameter("vegloaded");
		String barbecue=request.getParameter("barbecue");
		String sausage=request.getParameter("sausage");
		String NvegLoaded=request.getParameter("NvegLoaded");
		String ltea=request.getParameter("ltea");
		String pepsi=request.getParameter("pepsi");
		String clc=request.getParameter("clc");
		String garbread=request.getParameter("garbread");
		String taco=request.getParameter("taco");
		String wings=request.getParameter("wings");
		try(Connection conn=DriverManager.getConnection(url, user, password);
				PreparedStatement prestmt=conn.prepareStatement(sqlquery))
		{
			if(maxgreen=="" && pepaneer==""  && indipaneer==""  && fiesta==""  && supreme==""  && dominator==""  && capsicum==""  && corn==""  &&
					vegloaded==""  && barbecue==""  && sausage==""  && NvegLoaded==""  && ltea==""  && pepsi==""  && clc==""  && garbread==""  &&
					taco==""  && wings=="")
			{
				response.sendRedirect("orderpage.html");
			}
			else {
		if(maxgreen!=null)
		{
			String size=request.getParameter("size1");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max1"));
			prestmt.setString(1, maxgreen);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();
			
		}
		if(pepaneer!=null)
		{
			String size=request.getParameter("size2");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max2"));
			prestmt.setString(1, pepaneer);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();
		}
		
		if(indipaneer!=null)
		{
			String size=request.getParameter("size3");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max3"));
			prestmt.setString(1, indipaneer);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();
			
		}
		if(fiesta!=null)
		{
			String size=request.getParameter("size4");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max4"));
			prestmt.setString(1, fiesta);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
		if(supreme!=null)
		{
			String size=request.getParameter("size5");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max5"));
			prestmt.setString(1, supreme);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
		 if(dominator!=null)
		{
			String size=request.getParameter("size6");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max6"));
			prestmt.setString(1, dominator);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
			
		if(capsicum!=null)
		{
			String size=request.getParameter("size7");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max7"));
			prestmt.setString(1, capsicum);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();
		}
		 if(corn!=null)
		{
			String size=request.getParameter("size8");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max8"));
			prestmt.setString(1, corn);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
		if(vegloaded!=null)
		{
			String size=request.getParameter("size9");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max9"));
			prestmt.setString(1, vegloaded);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
		if(barbecue!=null)
		{
			String size=request.getParameter("size10");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max10"));
			prestmt.setString(1, barbecue);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();
		}
		if(sausage!=null)
		{
			String size=request.getParameter("size11");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max11"));
			prestmt.setString(1, sausage);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
		if(NvegLoaded!=null)
		{
			String size=request.getParameter("size12");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max12"));
			prestmt.setString(1, NvegLoaded);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
		if(ltea!=null)
		{
			String size=request.getParameter("size13");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max13"));
			prestmt.setString(1, ltea);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
		if(pepsi!=null)
		{
			String size=request.getParameter("size14");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max14"));
			prestmt.setString(1, pepsi);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
		if(clc!=null)
		{
			String size=request.getParameter("size15");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max15"));
			prestmt.setString(1, clc);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();	
		}
		if(garbread!=null)
		{
			String size=request.getParameter("size16");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max16"));
			prestmt.setString(1, garbread);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();
		}
		if(taco!=null)
		{
			String size=request.getParameter("size17");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max17"));
			prestmt.setString(1, taco);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();
		}
		if(wings!=null)
		{
			String size=request.getParameter("size18");//(PIZZA_NAME,SIZE,QUANTITY,PRICE)
			String[] arr=size.split(" ");
			String psize=arr[0];
			int price=Integer.parseInt(arr[1]);
			int qty=Integer.parseInt(request.getParameter("max18"));
			prestmt.setString(1, wings);
			prestmt.setString(2, psize);
			prestmt.setInt(3, qty);
			prestmt.setInt(4, (price*qty));
			prestmt.executeUpdate();
		}
			
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End: Order Selection");
		response.sendRedirect("address.jsp");
		System.out.println("End of DominosDataEntry page");
	}

}
