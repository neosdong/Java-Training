package com.neosdong;

import java.util.concurrent.TimeUnit;

/**
 * 20150223 Daemon Thread:主线程停止，其他线程即停止。Android的bindService机制类似。
 * @author leon
 *
 */
public class SimpleDaemons implements Runnable{

	@Override
	public void run() {
		while(true){
			try {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+" ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(new SimpleDaemons());
			thread.setDaemon(true);
			thread.start();
		}
		System.out.println("All the daemon threads started");
		try {
			TimeUnit.MILLISECONDS.sleep(175);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}


}
