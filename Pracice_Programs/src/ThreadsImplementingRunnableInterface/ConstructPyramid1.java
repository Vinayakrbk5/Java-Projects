package ThreadsImplementingRunnableInterface;

public class ConstructPyramid1 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<i+1;j++)
			{
			System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
	

}
