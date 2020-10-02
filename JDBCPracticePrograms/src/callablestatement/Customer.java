package callablestatement;

public class Customer {

private int custid;
private String name;
private int phone;
public Customer(int custid, String name, int phone) {
	super();
	this.custid = custid;
	this.name = name;
	this.phone = phone;
}
public int getCustid() {
	return custid;
}
public void setCustid(int custid) {
	this.custid = custid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "Customer [custid=" + custid + ", name=" + name + ", phone=" + phone + "]";
}

}
