package com.neosdong;

public class SimplePriorityThread extends Thread{
	
	private int round = 0;
	

	@Override
	public void run() {
		super.run();
		for (round=0;round<5;round++) {
		System.out.println(Thread.currentThread()+":"+round);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.yield();
		}
	}
}
