package com.zensar.assignment_18july.threads;

// values in thread

public class Ex3 extends Thread {

	public static int a=0;
	public static void main(String[] args) {
	    Ex3 thread = new Ex3();
	    
	    thread.start();
	    System.out.println(a);
	    a++;
	    System.out.println(a);
	  }
	  public void run() {
		  a++;
		  System.out.println("Thread is running, a: "+a);
	  }
}
