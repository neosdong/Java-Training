package com.neosdong;


public class SimplePriority implements Runnable{

	private int countDown = 5;
	private double r = 0;
	private Object lockObj = new Object();
	private int priority;
	
	public SimplePriority(int priority){
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return Thread.currentThread() + ":" + countDown;
	}
	
	@Override
	public void run() {
		Thread.currentThread().setPriority(priority);
		while(true){
			for (int i = 0; i < 100000; i++) {
				
				r += (Math.PI+Math.E)/(double)i;
			}
			System.out.println(this);
			if (--countDown<0) {
				return;
			}
			if (r%1000==0) {
			}
			Thread.yield();
		}
	}

}
