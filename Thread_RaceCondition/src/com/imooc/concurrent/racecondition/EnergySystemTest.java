package com.imooc.concurrent.racecondition;


public class EnergySystemTest {

	//将要构建的能量世界中能量盒子数量
	public static final int BOX_AMOUNT = 100;
	//每个盒子初始能量
    public static final double INITIAL_ENERGY = 1000;

    public static void main(String[] args){
    	EnergySystem eng = new EnergySystem(BOX_AMOUNT, INITIAL_ENERGY);
    	//@neosdong:线程的运行顺序与创建顺序是不一致的。交错运行。
    	for (int i = 0; i < BOX_AMOUNT; i++){
    		EnergyTransferTask task = new EnergyTransferTask(eng, i, INITIAL_ENERGY);
    		Thread t = new Thread(task,"TransferThread_"+i);
    		t.start();
    	}
    }

}