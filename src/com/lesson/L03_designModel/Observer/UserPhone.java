package com.lesson.L03_designModel.Observer;



public class UserPhone implements Observer {

	public void update(String msg) {
		System.out.println(": "+msg);
		
	}
	
}
