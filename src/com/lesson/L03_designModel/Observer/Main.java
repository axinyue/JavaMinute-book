package com.lesson.L03_designModel.Observer;

public class Main {
	public static void main(String[] args) {
		// 示例化对象, TODO 是否可以改成单例,多次使用只注册一次观察者们. 或者注册到工厂类中
		PayService payService = new PayService();
		
		UserPhone phone = new UserPhone();
		SuperMarketCounter counter = new SuperMarketCounter();

		//注册观察者
		payService.registerObserver(phone);
		payService.registerObserver(counter);
		
		payService.costMoney(100);
		
		payService.remoteObserver(phone);
		payService.costMoney(500);
		
	}
}
