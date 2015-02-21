package com.neosdong.concurrent;

import com.sun.org.apache.xml.internal.utils.StopParseException;

public class WrongStop extends Thread{
	
	/**
	 * Start of 正确的停止触发器
	 */
	private boolean keepRunning = true;
	
	public void stopRunning(){
		this.keepRunning = false;
	}
	/**
	 * End of 正确的停止触发器
	 */
	
	@Override
	public void run() {
		super.run();
        while (!isInterrupted()&&keepRunning) {
			System.out.println("Thread is running ... ");
			/*
			long time = System.currentTimeMillis();
			while((System.currentTimeMillis()-time)<500){
				//减少屏幕输出的空循环
			}*/
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				keepRunning = false;
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		WrongStop wrongStopThread = new WrongStop();
		System.out.println("Starting thread ... ");
		wrongStopThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Interrupting thread ...");
		//wrongStopThread.interrupt();//错误的停止方法
		wrongStopThread.stopRunning();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread is Stopping ... ");
	}
}
