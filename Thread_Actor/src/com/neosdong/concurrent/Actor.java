package com.neosdong.concurrent;

public class Actor extends Thread{
	public void run() {
		System.out.println(getName()+"Actor on stage...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		int count = 0;
		boolean keepRunning = true;
		
		while (keepRunning) {
			System.out.println(getName()+"Actor start showing"+(++count));
			
			if (count==100) {
				keepRunning = false;
			}
			
			if (count%10==0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(getName()+"Actor exit");
	}
	
	public static void main(String[] args) {
		Actor mrActor = new Actor();
		mrActor.setName("Mr.Actor");
		mrActor.start();
		
		new Thread(new Actress(),"Ms.Actress").start();
	}
}

	class Actress implements Runnable{

		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName()+"Actress on stage");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			int count = 0;
			boolean keepRunning = true;
			
			while (keepRunning) {
				System.out.println(Thread.currentThread().getName()+"Actress on show"+(++count));
				
				if(count==100){
					keepRunning = false;
				}
				
				if (count%10==0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
			System.out.println(Thread.currentThread().getName()+"Actress exit");
		}
		
		
	}
	
