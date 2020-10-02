package com.xworkz.deliveryitem;

public class Customer implements Runnable{
     Item it;
     
     public Customer(Item item) {
		this.it=item;
	}
	@Override
	public void run() {
		System.out.println("This is customer");
		for(int i=0;i<5;i++)
		{
		it.reciever(i);
		}
		
	}


}
