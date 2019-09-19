package com.lesson.L03_designModel.Observer;


// 银行卡绑定手机
public class UserPhone implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("你的银行卡消费: "+msg);
		
	}
	
}
