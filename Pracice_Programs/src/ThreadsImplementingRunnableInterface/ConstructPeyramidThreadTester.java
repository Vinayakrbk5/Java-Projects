package ThreadsImplementingRunnableInterface;

public class ConstructPeyramidThreadTester { 
	public static void main(String[] args) {
		ConstructPyramid1 r1=new ConstructPyramid1();
		Thread t1=new Thread(r1);
		t1.start();
		
//		ConstructPyramid1 r12=new ConstructPyramid1();
//		Thread t12=new Thread(r12);
//		t12.start();
		
		ConstructPyramid2 r2=new ConstructPyramid2();
		Thread t2=new Thread(r2);
		t2.start();
		
//		ConstructPyramid2 r22=new ConstructPyramid2();
//		Thread t22=new Thread(r22);
//		t22.start();
		
	}

}
