package com.xworkz.deliveryitem;

public class DeliveryBoy extends Thread{
Item it;
	public DeliveryBoy(Item item) {
		this.it=item;
	}
	
	@Override
		public void run() {
		System.out.println("This is delivery boy");
		for(int i=0;i<5;i++)
			it.giver(i);
		}

}
