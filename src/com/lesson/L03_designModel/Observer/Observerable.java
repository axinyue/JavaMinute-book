package com.lesson.L03_designModel.Observer;


/*�۲���, �۲������״̬,Ȼ����ݸı��״ִ̬�в���.
 * �ʺϵ�һ��״̬����ʱ,��Ҫ֪ͨ�������ִ�в����ĳ���
 * */
public interface Observerable {
	public void registerObserver(Observer o);   //��ӹ۲���
	public void remoteObserver(Observer o);		//ȥ���۲���
	public void notifyObserver();				//���й۲�����Ӧ
}
