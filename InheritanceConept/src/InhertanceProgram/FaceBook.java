package InhertanceProgram;

public class FaceBook {
	String emailid;
	String name;
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addfrnd()
	{
		System.out.println("The new friend is added to facebook");
	}
	public void sendrqst()
	{
		System.out.println("The freind request is sent through the facebooks");
	}
	

}
