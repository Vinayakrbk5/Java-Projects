package InhertanceProgram;

public class ChattingTester extends Chatting {

	public static void main(String[] args) {
		Chatting tester=new Chatting();
		
		tester.setEmailid("XWorkz@gmail.com");
		tester.setName("Bangalore");
		
		tester.setStories(false);
		tester.setActivestatus(true);
		
		tester.setTheme(true);
		
		System.out.println("The emalil id is :"+tester.getEmailid());  // accessing Facebook data members
		System.out.println("The name is : "+tester.getName());
		System.out.println();
		
		System.out.println("is stories :"+tester.isStories);  //  accessing messenger data members
		System.out.println("is there is theme :"+tester.isTheme);
		System.out.println();
		
		System.out.println("is showing active status :"+tester.isActivestatus); //  accessing chatting data members
		System.out.println();
		
		tester.addfrnd();
		tester.sendrqst();
		System.out.println();
		
		tester.videocall();
		tester.audiocall();
		System.out.println();
		
		tester.texttype();
		tester.emoji();
	
	}

}
