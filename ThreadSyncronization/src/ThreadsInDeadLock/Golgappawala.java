package ThreadsInDeadLock;

public class Golgappawala extends Thread {
	
	private Plate p;
	public Golgappawala(Plate p)
	{
		this.p=p;
	}
	@Override
	public void run() {
		for(int i=1;i<=6;i++) {
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		p.serve(i);
		}
		
	}
	

}
