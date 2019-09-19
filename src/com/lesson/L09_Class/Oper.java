package com.lesson.L09_Class;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Oper {
	User user ;
	User user2 ;
	Class<? extends User> clz;
	Class<? extends User> clz2;
	
	@Before
	public void Init() {
		 user = new User("xxx",123);
		 user2 = new User("bxxx",123);
		 
		 clz =  user.getClass();
		 clz2 = user2.getClass();
	}
	
	@Test
	/**
	 * 判断 Class的引用
	 */
	public void TestOne() {
		
		
		
		Assert.assertEquals(clz,clz2);
		
	}
	
	@Test
	/**
	 * 获取类的属性。
	 */
	public void TestTwo() {
		// 获取属性. getFields() 只能获取public 的成员。
		Field[] fields = clz.getFields();
		
		for(Field field:fields) {
			System.out.println(field.getName());
		}
		
		/*Annotation[] annotations =  clz2.getDeclaredAnnotations();
		for(Annotation annotation:annotations) {
			System.out.println(annotation);
		}*/
	}
	/**
	 * 获取接口
	 */
	
	@Test
	public void TestThree() {
		Class<?>[] clzs = clz.getInterfaces();
		for(Class<?> t:clzs) {
			System.out.println("Interfaces: "+t.getName());
		}
		
	}
	
}
