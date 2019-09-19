package com.lesson.L08_abstract;

/**
 * 抽象类 继承 接口时，不一定要完全实现接口的方法. 但其实体子类需要实现所有的接口。
 * 
 * @author computer
 *
 */
public abstract class BasePlayer implements Base {
	private String name;
	private String level;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setlevel(String level) {
		this.level = level;
	}
	
	/*public void saveFile()
	{
		
	}	*/
}
