package com.lesson.L03_designModel.Observer;



public interface Observerable {
	public void registerObserver(Observer o);  
	public void remoteObserver(Observer o);		
	public void notifyObserver();				
}
