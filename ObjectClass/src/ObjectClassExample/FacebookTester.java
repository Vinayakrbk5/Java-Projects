package ObjectClassExample;

public class FacebookTester {
	public static void main(String[] args) {
		FaceboocAct  sahara=new FaceboocAct();
		sahara.emailId="sahara@gmailcom";
		sahara.id=20;
		sahara.useName="Sahara";
		FaceboocAct saha=sahara;  /// referring to same Object
		//System.out.println(sahara.equals(saha));  //comparing same objects
		
		FaceboocAct  karna=new FaceboocAct();
		karna.emailId="sahara@gmailcom";
		karna.id=35;
		karna.useName="Sahara";
		if(sahara.equals(karna))   // Comparing different objects of same data members
		{
			System.out.println("do not create new account");
		}
		else
		{
			System.out.println("create a new Account");
		}
		
		System.out.println(sahara.hashCode());   // this will call hascode() method and takes value returned by the hashCode() value as 20
		
	}
	

}
