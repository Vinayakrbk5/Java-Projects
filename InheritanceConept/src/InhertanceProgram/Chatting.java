package InhertanceProgram;

public class Chatting extends Messanger {
	boolean isTheme;

	public boolean isTheme() {
		return theme;
	}

	public void setTheme(boolean theme) {
		this.isTheme = theme;
	}

	public void texttype()
	{
		System.out.println("Typing text message");
	}
	public void emoji()
	{
		System.out.println("using emojis");
	}
}
