package com.neosdong;

public class SellTicketRunnable implements Runnable{

	private int ticketCount = 5;
	
	@Override
	public void run() {
		while(ticketCount>0){
			ticketCount--;
			System.out.println(Thread.currentThread().getName()
					+" sell one tciket left "+ ticketCount );
		}
	}

}
