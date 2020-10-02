package batcjupdate;

import java.util.ArrayList;

import jdbccrudimpl.Customer;

public class BatchUpdateTester {
public static void main(String[] args) {
	ArrayList<Customer> custlist = new ArrayList<>();
	custlist.add(new Customer(10, "Karnataka", "9876543245"));
	custlist.add(new Customer(11, "Kerala", "7867485784765"));
	custlist.add(new Customer(12, "Maharastra", "984636354745"));

	System.out.println(custlist);
	
	BatchUpdate bu=new BatchUpdate();
	bu.batchupdate(custlist);
	
	

}

}
