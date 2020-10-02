package com.xworkz.deliveryitem;

public class Item {
	boolean cashGiven = false;

	public synchronized void giver(int item) {
		if (cashGiven == true) {
			

		} else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Item delivered to customer= " + item);
		cashGiven = false;
		notify();
	}

	public synchronized void reciever(int item) {
		if (cashGiven == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		} else {
			
		}
		System.out.println("Let's Take the amount " + item + " time");
		cashGiven = true;
		notify();
	}
}
