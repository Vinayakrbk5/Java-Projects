package com.xworkz.deliveryitem;

public class ItemTesting {

	public static void main(String[] args) {
		Item it=new Item();
		Thread th1=new Thread(new Customer(it));
		th1.start();
		
		System.out.println();
		
		DeliveryBoy delBoy=new DeliveryBoy(it);
		delBoy.start();
	}

}
