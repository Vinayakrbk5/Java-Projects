package com.xworkz.syncronization;

public class Student {

	public synchronized void send()
	{
		System.out.println("This is Send method");
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	public synchronized void recieve()
	{
		System.out.println("This is recieve method");
		notify();
		send();
	}
}
