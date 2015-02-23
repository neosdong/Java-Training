package com.neosdong;



public class SellTicketThread extends Thread{

	private int ticketCount = 5;
	
	@Override
	public void run() {
		super.run();
		while(ticketCount>0){
			ticketCount --;
			System.out.println(Thread.currentThread().getName()
					+" sell one ticket," + "left" + ticketCount);
		}
	}
}
