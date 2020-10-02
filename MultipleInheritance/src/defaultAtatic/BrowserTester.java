package defaultAtatic;

public class BrowserTester {
public static void main(String[] args) {
	Crome cr=new Crome();
	cr.search();
	cr.plugin();
	
	System.out.println();
	In    ternetExplorer ie=new InternetExplorer();
	ie.search();
	ie.plugin();
	Browser.inconito();  //  we cannot call  static methods  using object of child class but have to call using class name
}
}
