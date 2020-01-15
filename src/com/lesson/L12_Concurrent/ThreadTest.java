package com.lesson.L12_Concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

import junit.framework.TestCase;

public class ThreadTest extends TestCase {
	
	public class TestThreadOne extends Thread{
		private Map<String, String> s;
		private List<String> s2;
		private int count;
		
		public TestThreadOne(String name,Map<String, String> s,int count) {
			super(name);
			this.s = s;
			this.count = count;
		}
		
		public TestThreadOne(String name,List<String> s2,int count) {
			super(name);
			this.s2 = s2;
			this.count = count;

		}
		
		
		@Override
		public void run() {
			System.out.println(getName());
			if(s!=null) {
				for(int i=0;i<count;i++) {
					s.put("key"+i, "value"+i);
					//System.out.println(s.get("key"+i));
				}
				System.out.println(s.size());
			}
			
			
			if(s2!=null){
				System.out.println("runing ...");
				for(int i=1;i<=count;i++) {
					s2.add("key"+i);
					
					//System.out.println(s.get("key"+i));
				}
			System.out.println(s2.size());
			}
		}
		
	}
	
	
	/**
	 * HashMap 的线程安全
	 */
	@Test
	public void test1(){
		// HashMap的测试，并未发现安全问题。考虑代码总并未做安全设计，不建议使用。（未知并发问题）
		//Map<String, String> s1 = new HashMap<String, String>();

		Map<String, String> s1 = new ConcurrentHashMap<String, String>();
		for(int i=0;i<=2;i++) {
			new TestThreadOne("t"+i,s1,100).start();
			
		}
		System.out.println(s1.size());
	}
	
	/**
	 *   线程安全的List操作。使用Collections.synchronizedList
	 * 
	 */
	
	@Test
	public void test2() {
		List<String> s3 = new ArrayList<String>() ;
		List<String> share_list =  Collections.synchronizedList(s3);
		List<Thread> threads = new ArrayList<Thread>();
		for(int i=1;i<=4;i++) {
			TestThreadOne t = new TestThreadOne("t"+i,share_list,100);
			threads.add(t);
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			t.start();
		}
		// 这是判断线程是否结束，线程结束后获取准确结果
		
		  while(true) { boolean wait_quit = false; boolean wait_status = false;
		  for(Thread t:threads) {
		  
		  if(t.isAlive()) { System.out.println("isAlive: "+t.isAlive()); wait_status =
		  true; } } if(!wait_status) { wait_quit=true; }
		  
		  if(wait_quit) { break; } }
		 
		System.out.println("============= "+share_list.size());
		assertEquals(share_list.size(), 400);
	
	}
	
}
