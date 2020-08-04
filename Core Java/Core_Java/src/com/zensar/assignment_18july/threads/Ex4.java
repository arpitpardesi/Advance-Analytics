package com.zensar.assignment_18july.threads;

// checking thread is alive

public class Ex4 extends Thread {

	public static int a=0;
	public static void main(String[] args) {
	    Ex4 thread = new Ex4();
	    thread.start();
	    while(thread.isAlive()) {
	        System.out.println("Waiting...");
	      }
	    System.out.println(a);
	    a++;
	    System.out.println(a);
	  }
	  public void run() {
		  a++;
		  System.out.println("Thread is running, a: "+a);
	  }
}
