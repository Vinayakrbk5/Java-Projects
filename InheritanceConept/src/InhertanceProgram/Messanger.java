package InhertanceProgram;

public class Messanger extends FaceBook {
	boolean isStories;
	boolean isActivestatus;
	
	

	public boolean isStories() {
		return isStories;
	}
	public void setStories(boolean isStories) {
		this.isStories = isStories;
	}
	public boolean isActivestatus() {
		return isActivestatus;
	}
	public void setActivestatus(boolean isActivestatus) {
		this.isActivestatus = isActivestatus;
	}
	public void videocall()
	{
		System.out.println("doing videocall in messanger");
	}
	public void audiocall()
	{
		System.out.println("doing audiocall in messenger");
	}
	

}
