package com.neosdong;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.corba.se.impl.orbutil.closure.Future;

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
		
		
		
		/*
		Runnable sellTickRunnable = new SellTicketRunnable();
		new Thread(sellTickRunnable).start();
		new Thread(sellTickRunnable).start();
		new Thread(sellTickRunnable).start();
		*/
		
		/*-----Java Executors-----*/
		/*
		Runnable sellTickRunnable2 = new SellTicketRunnable();
		//ExecutorService executorService = Executors.newCachedThreadPool();//实测5条线程
		//ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for (int i = 0; i < 10; i++) {
			executorService.execute(sellTickRunnable2);
		}
		executorService.shutdown();
		
		//------Task with Result
		ArrayList<java.util.concurrent.Future<String>> results = new ArrayList<>();
		
		ExecutorService executorService3 = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			TaskWithResult task = new TaskWithResult(i);
			results.add(executorService3.submit(task));
		}
		
		
		for (java.util.concurrent.Future<String> fs:results) {
			try {
				System.out.println(fs.get());
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		executorService3.shutdown();
		*/
		
		
		ExecutorService execPriority = Executors.newCachedThreadPool();
		for (int i = 0; i < 4; i++) {
			execPriority.execute(new SimplePriority(Thread.MIN_PRIORITY));
		}
		execPriority.execute(new SimplePriority(Thread.MAX_PRIORITY));
		execPriority.shutdown();
	}

}
