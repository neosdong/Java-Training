package com.neosdong;

public class SellTicketThread extends Thread{

    private int ticketCount = 4;
    public Object lockObj = new Object();
    
    	
	@Override
	public void run() {
        while(ticketCount>0){
        	synchronized (lockObj) {
        		try {
					lockObj.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		ticketCount--;
        		System.out.println(Thread.currentThread().getName()
					+" sell one tciket left "+ ticketCount );
        		lockObj.notifyAll();
			}
		}
	}

}
