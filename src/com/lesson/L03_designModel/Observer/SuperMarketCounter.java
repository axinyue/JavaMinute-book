package com.lesson.L03_designModel.Observer;

// �����г�����̨
public class SuperMarketCounter implements Observer {

	@Override
	public void update(String msg) {
		System.out.println("�տ�: "+msg);
	}
	
}
