package com.neosdong;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SellTicketThread sellTicketThread = new SellTicketThread();
		SellTicketThread sellTicketThread2 = new SellTicketThread();
		SellTicketThread sellTicketThread3 = new SellTicketThread();
		
		/*
		sellTicketThread.start();
		sellTicketThread2.start();
		sellTicketThread3.start();
		*/
		
		
		
		Runnable sellTickRunnable = new SellTicketRunnable();
		new Thread(sellTickRunnable).start();
		new Thread(sellTickRunnable).start();
		new Thread(sellTickRunnable).start();
		
		
		System.out.println("-----Java Executors-----");
		Runnable sellTickRunnable2 = new SellTicketRunnable();
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(sellTickRunnable2);
		}
		executorService.shutdown();
	}

}
