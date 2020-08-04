package com.zensar.assignment_18july.threads;

//implements Runnable Interface 

public class Ex2 implements Runnable {

	public static void main(String[] args) {
		Ex2 obj = new Ex2();
		Thread thread = new Thread(obj);
		thread.start();
	}

	public void run() {
		System.out.println("Thread is running");
	}

}
