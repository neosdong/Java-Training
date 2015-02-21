package com.neosdong.ab_factory;

public class HNYFactory implements PersonFactory{

	@Override
	public Boy getBoy() {
		// TODO Auto-generated method stub
		return new HNYBoy();
	}

	@Override
	public Girl getGirl() {
		// TODO Auto-generated method stub
		return new HNYGirl();
	}
	
}
