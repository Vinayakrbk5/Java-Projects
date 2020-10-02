package ThreadsInDeadLock;

public class ProducerConsumerTester {
	public static void main(String[] args) {
		Plate pt=new Plate() ;
		Golgappawala t1=new Golgappawala(pt);
		
		Eater t2=new Eater(pt);
		
		t1.start();
		t2.start();
	}

}
