package com.lesson.L03_designModel.Observer;

import java.util.ArrayList;
import java.util.List;


// ֧������
public class PayService implements Observerable {
	
	private List<Observer> noticeServices;
	private int cost;
	
	public PayService(){
		noticeServices = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer noticeService) {
		noticeServices.add(noticeService);
		
	}

	@Override
	public void remoteObserver(Observer noticeService) {		// TODO Auto-generated method stub
		noticeServices.remove(noticeService);
	}

	@Override
	public void notifyObserver() {
		//֧����ɺ�֪ͨ �ֻ�����,��̨������,�۷ѷ����
		for(int i=0;i<noticeServices.size();i++) {
			Observer noticeService = noticeServices.get(i); 
			
			noticeService.update(String.valueOf(cost));
		}
		
	}
	
	public void costMoney(int cost) {
		this.cost = cost;
		notifyObserver();
	}
	
}
