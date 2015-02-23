package com.neosdong;

public class SimplePriorityThread extends Thread{

	@Override
	public void run() {
		super.run();
		for (int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName());
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
