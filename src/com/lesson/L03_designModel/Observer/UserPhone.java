package com.lesson.L03_designModel.Observer;


// ���п����ֻ�
public class UserPhone implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("������п�����: "+msg);
		
	}
	
}
