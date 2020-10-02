package ThreadSyncronizationEx;

public class Thread1  extends Thread{
	private Multiflier ml;
	public Thread1(Multiflier ml) {
		this.ml=ml;
		
	}
	@Override
	public void run() {
		Thread.currentThread().setName("Multifly by 16");
		ml.Multifly(16);
		
	}

}

