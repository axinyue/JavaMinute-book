package com.lesson.L03_designModel.Observer;

public class Main {
	public static void main(String[] args) {
		// ʾ��������, TODO �Ƿ���Ըĳɵ���,���ʹ��ֻע��һ�ι۲�����. ����ע�ᵽ��������
		PayService payService = new PayService();
		
		UserPhone phone = new UserPhone();
		SuperMarketCounter counter = new SuperMarketCounter();

		//ע��۲���
		payService.registerObserver(phone);
		payService.registerObserver(counter);
		
		payService.costMoney(100);
		
		payService.remoteObserver(phone);
		payService.costMoney(500);
		
	}
}
