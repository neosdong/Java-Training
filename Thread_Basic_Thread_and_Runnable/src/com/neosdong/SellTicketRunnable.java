package com.neosdong;

import javax.media.j3d.Leaf;

public class SellTicketRunnable implements Runnable{

    private int ticketCount = 100;
    public Object lockObj = new Object();
    
    	
	@Override
	public void run() {
        while(true){
        	synchronized (lockObj) {//代码片锁
        		if (ticketCount<=0) {//线程中止条件
					break;
				}
        		ticketCount--;
        		String left = ticketCount>1?(ticketCount+"s"):ticketCount+"";
        		System.out.println(Thread.currentThread().getName()
					+" sell one tciket left "+ left );
			}
        	Thread.yield();//释放CPU线程资源
		}
        
	}

}
