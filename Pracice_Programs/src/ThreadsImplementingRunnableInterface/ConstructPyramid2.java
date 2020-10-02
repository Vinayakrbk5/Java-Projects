package ThreadsImplementingRunnableInterface;

public class ConstructPyramid2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6-i;j++)
			{
			System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
