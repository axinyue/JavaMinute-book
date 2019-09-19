package com.lesson.L03_designModel.Observer;

// 超级市场收银台
public class SuperMarketCounter implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("收款: "+msg);
	}
	
}
