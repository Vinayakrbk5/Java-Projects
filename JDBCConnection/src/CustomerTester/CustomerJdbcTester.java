package CustomerTester;

import java.util.Scanner;

import jdbccrudimpl.Customeropsimpl;

public class CustomerJdbcTester {

	public static void main(String[] args) {
		Customeropsimpl cust = new Customeropsimpl();
		Scanner scan = new Scanner(System.in);

//		method to display all records from customer table
		System.out.println("Customer Database elements are :");
		cust.displayAllRecord();
 
//		method to display the selected record from customer table
		System.out.println("\n"+"Enter the Customer id to display that record:");
		int customerid = scan.nextInt();
		cust.displayselectedCustomer(customerid);

//		method to update customer table 
		System.out.println("\n"+"Enter the customer id whose information has to update: ");
		int update = scan.nextInt();
		cust.updateCustomerRecord(10, "Vinayak", "\t"+"91865545665", update);

//		method to delete record from customer table
		System.out.println("\n"+"Enter the customer id whose record is to be deleted");
		int del = scan.nextInt();
		cust.deleteCustomerRecord(del);
		
//		method to insert record into customer table
		System.out.println("\n"+"Now one record is going to insert"+"\n");
		
		System.out.println("Enter id ,Name and phone number to insert into table");
		
		int cid=scan.nextInt();
		String name=scan.next();
		String phone=scan.next();
		
//		System.out.println(cid);
//		System.out.println(name);
//		System.out.println(phone);
		
		cust.insertRecord(cid, name, "\t"+phone);
		
//		cust.insertRecord(9, "Shankar", "\t"+"9867886454");
		
	}
}
