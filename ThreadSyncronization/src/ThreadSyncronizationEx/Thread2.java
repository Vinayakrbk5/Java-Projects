package ThreadSyncronizationEx;

public class Thread2 implements Runnable{
	private Multiflier ml;
	public Thread2(Multiflier ml) {
		this.ml=ml;
		
	}
	@Override
	public void run() {
		Thread.currentThread().setName("Multifly by 55");
		ml.Multifly(55);
	}

}
