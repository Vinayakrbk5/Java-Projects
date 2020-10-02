package ObjectClassExample;

public class FaceboocAct {
	int id;
	String useName;
	String emailId;
	
	@Override
	public boolean equals(Object Obj)
	{
		return(this.emailId.equals(((FaceboocAct)Obj).emailId)&&(this.useName.equals(((FaceboocAct)Obj).useName)));
		/*FaceboocAct temp=(FaceboocAct)Obj;
		boolean result=this.emailId.equals(temp.emailId);   // here this is referring the current class members
		return result;*/
	}
	@Override
	public int  hashCode()
	{
		return id;    // this will return id
	}
}
