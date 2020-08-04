package com.zensar.assignment_18july.threads;

//extends Thread class 

public class Ex1 extends Thread {

	public static void main(String[] args) {
		Ex1 thread = new Ex1();
		thread.start();
	}

	public void run() {
		System.out.println("Thread is running");
	}

}
