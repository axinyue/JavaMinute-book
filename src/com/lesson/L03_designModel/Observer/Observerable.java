package com.lesson.L03_designModel.Observer;


/*观察者, 观察变量的状态,然后根据改变的状态执行操作.
 * 适合当一个状态更改时,需要通知多个类型执行操作的场景
 * */
public interface Observerable {
	public void registerObserver(Observer o);   //添加观察者
	public void remoteObserver(Observer o);		//去除观察者
	public void notifyObserver();				//所有观察者响应
}
