package ThreadsInDeadLock;

public class ProducerConsumerTester2UsingAnonymousClass {
	public static void start()
	{
		System.out.println("Start of the Golgappa giving and eating Process");	
	}
	
	public static void end()
	{
		System.out.println("End of the Golgappa giving and eating Process");	
	}
	
	public static void main(String[] args) {
		start();
		Plate2 pt = new Plate2() {  // this is class Plate2() interface defined by anonymous class
			int golgappa;
			boolean available;

			@Override
			public synchronized void serve1(int golgappa) {
				if (available == true) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.golgappa = golgappa;
				System.out.println("Golgappa given to Consumer:" + golgappa);
				available = true;
				notifyAll();
			}
			 @Override
			public synchronized void get1() {
				if (available == false) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Golgappa Consumed by consumer:" + golgappa);
				available = false;
				notifyAll();
			}
		};

		
		Golgappa2 g2 = new Golgappa2() {  // this is Golgappa2() interface extending Runnable Interface defines using anonymous class
			Plate2 p;

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					p.serve1(i);
				}
			}

			@Override
			public void give(Plate2 p) {
				this.p=p;
			}

		};
		g2.give(pt);  // here object of Plate2 class in sent
		
		Thread t1 = new Thread(g2);  // Threadt1 is created


		Eater2 e2 = new Eater2() {   // this is Eater2() interface extending Runnable Interface defines using anonymous class
			Plate2 p;

			public void eat(Plate2 p) {
				this.p = p;
			}

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					p.get1();
				}
			}

		};
		e2.eat(pt); // here object of Plate2 class is sent
		
		Thread t2 = new Thread(e2);  // Thread t2 is created

		t1.start();
		t2.start();

		end();
	}

}
