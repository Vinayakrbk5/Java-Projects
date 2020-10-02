package jdbccrud;

public interface CustomerOps {
	public void displayselectedCustomer(int custid);

	public void updateCustomerRecord(int custid, String custname, String phone, int update);

	public void deleteCustomerRecord(int custid);

	public void displayAllRecord();
	public void insertRecord(int custid,String custname,String phone);

}
