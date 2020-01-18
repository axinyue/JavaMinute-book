package com.lesson.L08_abstract;

/**
 * 
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
	
	public void saveFile()
	{
		
	}
}
