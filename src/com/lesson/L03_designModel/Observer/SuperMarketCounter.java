package com.lesson.L03_designModel.Observer;


public class SuperMarketCounter implements Observer {


	public void update(String msg) {
		System.out.println(""+msg);
	}
	
}
