package com.neosdong;

import com.sun.org.apache.bcel.internal.generic.NEW;


public class SellTicketRunnable implements Runnable{

    private int ticketCount = 4;
    	
	@Override
	public void run() {
        while(ticketCount>0){
        	ticketCount--;
        	System.out.println(Thread.currentThread().getName()
					+" sell one tciket left "+ ticketCount );
		}
        	
	}

}
