package batchupdate;

import java.util.ArrayList;

import CrudOpOnCustomerTable.Customer;

public class PreparedStatementUpdateTester
{
	public static void main(String[] args) {
		ArrayList<Customer> arrlist=new ArrayList<>();
		arrlist.add(new Customer(2, "Vinayak", "8381726861"));
		arrlist.add(new Customer(4, "Ravi", "9898237999"));
		arrlist.add(new Customer(6,"Sharath", "9872387623"));
		
		BatchUpdateUsingPreparedStatement bu=new BatchUpdateUsingPreparedStatement();
		bu.batchUpdate(arrlist);
		
	}


}
