package jdbccrudimpl;

public class Customer {
	private int custid;
	private String custname;
	private String custphone;
	public Customer(int custid, String custname, String custphone) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custphone = custphone;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustphone() {
		return custphone;
	}
	public void setCustphone(String custphone) {
		this.custphone = custphone;
	}
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", custphone=" + custphone + "]";
	}

}
